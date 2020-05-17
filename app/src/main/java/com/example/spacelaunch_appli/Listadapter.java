package com.example.spacelaunch_appli;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Listadapter extends RecyclerView.Adapter<Listadapter.ViewHolder> {
    private Context context;
    private List<Launch> values;




    class ViewHolder extends RecyclerView.ViewHolder{
             TextView txtmission;
             TextView txtnet;
             TextView txtagencies;

             ImageView fuseeimage;
             View layout;

    ViewHolder(View v){
        super(v);
        layout=v;

        txtmission=(TextView) v.findViewById(R.id.titre_mission);
        txtnet=(TextView) v.findViewById(R.id.pad_name);
        txtagencies=(TextView)v.findViewById(R.id.titre_agency);
        fuseeimage=(ImageView)v.findViewById(R.id.fusee_image);

    }
}

    public void add(int position,Launch item){
        values.add(position, item);
        notifyItemInserted(position);
}

    // Provide a suitable constructor (depends on the kind of dataset)
    public Listadapter(List<Launch> myDataset,Context context) {
        this.values = myDataset;
        this.context = context;
    }

// Create new views (invoked by the layout manager)
@Override
public Listadapter.ViewHolder onCreateViewHolder(
        ViewGroup parent,
        int viewType) {
    // create a new view
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View v = inflater.inflate(R.layout.section, parent, false);
    // set the view's size, margins, paddings and layout parameters
    ViewHolder vh = new ViewHolder(v);
    return vh;
}

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Launch currentLaunch = values.get(position);
        holder.txtmission.setText(currentLaunch.getMission());
        holder.txtnet.setText(currentLaunch.getNet());
        holder.txtagencies.setText(currentLaunch.getPadagencies());
        Glide.with(context).load(values.get(position).getFuseeimage()).into(holder.fuseeimage);



        holder.fuseeimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,infoLaunch.class);

                intent.putExtra("rocketname",currentLaunch.getRocketname());
                intent.putExtra("rocketconfiguration",currentLaunch.getRocketconfiguration());
                intent.putExtra("rocketfamilly",currentLaunch.getRocketfamilyname());
                intent.putExtra("rcname",currentLaunch.getRcname());
                intent.putExtra("rcabbrev",currentLaunch.getRcabbrev());
                intent.putExtra("countrycode",currentLaunch.getCountryCode());
                intent.putExtra("fuseeimage",currentLaunch.getFuseeimage());
                intent.putExtra("agenciesimage",currentLaunch.getAgencyimage());
                intent.putExtra("mission",currentLaunch.getMission());
                intent.putExtra("windowstart",currentLaunch.getWindowstart());
                intent.putExtra("windowend",currentLaunch.getWindowend());
                intent.putExtra("net",currentLaunch.getNet());
                intent.putExtra("location",currentLaunch.getLocation());
                intent.putExtra("padname",currentLaunch.getPadname());
                intent.putExtra("latitude",currentLaunch.getLatitude());
                intent.putExtra("longitude",currentLaunch.getLongitude());
                intent.putExtra("padagencies",currentLaunch.getPadagencies());
                intent.putExtra("missionname",currentLaunch.getMissionname());
                intent.putExtra("description",currentLaunch.getDescription());
                intent.putExtra("typemission",currentLaunch.getTypemission());
                intent.putExtra("lspname",currentLaunch.getLspname());
                intent.putExtra("lspcountrycode",currentLaunch.getLspcountryCode());
                intent.putExtra("agenciesname",currentLaunch.getAgenciesname());
                intent.putExtra("lspabrrev",currentLaunch.getLspabbrev());
                intent.putExtra("agenciesabbrev",currentLaunch.getAgenciesabbrev());




                context.startActivity(intent);
                /*
                    Intent myIntent=new Intent(LaunchActivity.this, infoLaunch.class);
                     myIntent.putExtra("key",value);
                    LaunchActivity.this.startActivity(myIntent);
*/
                }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}