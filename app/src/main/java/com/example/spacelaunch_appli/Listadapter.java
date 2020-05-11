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

    private ImageView fuseeimage;



    class ViewHolder extends RecyclerView.ViewHolder{
         TextView txtmission;
         TextView txtpad;
         TextView txtagencies;

        View layout;

    ViewHolder(View v){
        super(v);
        layout=v;

        txtmission=(TextView) v.findViewById(R.id.titre_mission);
        txtpad=(TextView) v.findViewById(R.id.pad_name);
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
        holder.txtpad.setText(currentLaunch.getPadname());
        holder.txtagencies.setText(currentLaunch.getPadagencies());
        Glide.with(context).load(values.get(position).getFuseeimage()).into(fuseeimage);



        holder.txtmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,infoLaunch.class);
                intent.putExtra("windowstart",currentLaunch.getWindowstart());
                intent.putExtra("windowend",currentLaunch.getWindowend());
                intent.putExtra("windownet",currentLaunch.getNet());
                intent.putExtra("mission",currentLaunch.getMission());
                intent.putExtra("txtagenciesimage",currentLaunch.getAgencyimage());
                intent.putExtra("txtfuseeimage",currentLaunch.getFuseeimage());
                intent.putExtra("txtrocketname",currentLaunch.getRocketname());



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