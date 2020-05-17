package com.example.spacelaunch_appli;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static java.lang.reflect.Array.getInt;
import static java.lang.reflect.Array.set;

public class infoLaunch extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);


/*
    private void setter(String txtrocketname, String txtrocketconfiguration, String txtrocketfamilly, String txtrcname,
                     String txtrcabbrev, String txtcountrycode, String txtfuseeimage, String txtagenciesimage,
                     String txtmission, String txtwindowstart, String txtwindowend, String txtnet,
                     String txtlocation, String txtpadname, String txtlatitude, String txtlongitude,
                     String txtpadagencies, String txtmissionname, String txtdescription,
                     String txttypemission, String txtlspname, String txtlspabrrev,
                     String txtlspcountrycode, String txtagenciesname, String txtagenciesabbrev) {
*/
        Intent intent=getIntent();

        String txtrocketname=intent.getStringExtra("rocketname");
        String txtrocketconfiguration=intent.getStringExtra("rocketconfiguration");
        String txtrocketfamilly=intent.getStringExtra("rocketfamilly");
        String txtrcname=intent.getStringExtra("rcname");
        String txtrcabbrev=intent.getStringExtra("rcabbrev");
        String txtcountrycode=intent.getStringExtra("countrycode");
        String txtfuseeimage=intent.getStringExtra("fuseeimage");
        String txtagenciesimage=intent.getStringExtra("agenciesimage");
        String txtmission=intent.getStringExtra("mission");
        String txtwindowstart=intent.getStringExtra("windowstart");
        String txtwindowend=intent.getStringExtra("windowend");
        String txtnet=intent.getStringExtra("net");
        String txtlocation=intent.getStringExtra("location");
        String txtpadname=intent.getStringExtra("padname");
        String txtlatitude=intent.getStringExtra("latitude");
        String txtlongitude=intent.getStringExtra("longitude");
        String txtpadagencies=intent.getStringExtra("padagencies");
        String txtmissionname=intent.getStringExtra("missionname");
        String txtdescription=intent.getStringExtra("description");
        String txttypemission=intent.getStringExtra("typemission");
        String txtlspname=intent.getStringExtra("lspname");
        String txtlspcountrycode=intent.getStringExtra("lspcountrycode");
        String txtagenciesname=intent.getStringExtra("agenciesname");
        String txtlspabrrev=intent.getStringExtra("lspabrrev");
        String txtagenciesabbrev=intent.getStringExtra("agenciesabbrev");

        TextView padagencies = (TextView)findViewById(R.id.padagencies);
        padagencies.setText(txtpadagencies);

        TextView missionname = (TextView)findViewById(R.id.titre_mission);
        missionname.setText(txtmissionname);

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(txtdescription);

        TextView typemission = (TextView)findViewById(R.id.typemission);
        typemission.setText(txttypemission);

        TextView lspname = (TextView)findViewById(R.id.lspname);
        lspname.setText(txtlspname);

        TextView lspabrrev = (TextView)findViewById(R.id.lspabrrev);
        lspabrrev.setText(txtlspabrrev);

        TextView lspcountrycode =(TextView) findViewById(R.id.lspcountrycode);
        lspcountrycode.setText(txtlspcountrycode);

        TextView agenciesname = (TextView)findViewById(R.id.agenciesname);
        agenciesname.setText(txtagenciesname);

        TextView agenciesabbrev =(TextView) findViewById(R.id.agenciesabbrev);
        agenciesabbrev.setText(txtagenciesabbrev);

        TextView location =(TextView) findViewById(R.id.location);
        location.setText(txtlocation);

        TextView padname =(TextView) findViewById(R.id.padname);
        padname.setText(txtpadname);

        TextView rocketfamilly =(TextView) findViewById(R.id.rocketfamilyname);
        rocketfamilly.setText(txtrocketfamilly);

        TextView latitude =(TextView) findViewById(R.id.latitude);
        latitude.setText(txtlatitude);

        TextView rocketname =(TextView) findViewById(R.id.rocketname);
        rocketname.setText(txtrocketname);

        TextView rocketconfiguration = (TextView)findViewById(R.id.rocketconfiguration);
        rocketconfiguration.setText(txtrocketconfiguration);

        TextView rcname = (TextView)findViewById(R.id.rcname);
        rcname.setText(txtrcname);

        TextView rcabbrev = (TextView)findViewById(R.id.rcabbrev);
        rcabbrev.setText(txtrcabbrev);

        TextView countrycode = (TextView)findViewById(R.id.rccountrycode);
        countrycode.setText(txtcountrycode);

        TextView mission = (TextView)findViewById(R.id.missionname);
        mission.setText(txtmission);

        TextView windowstart = (TextView)findViewById(R.id.windowstart);
        windowstart.setText(txtwindowstart);

        TextView windowend = (TextView)findViewById(R.id.windowend);
        windowend.setText(txtwindowend);

        TextView net = (TextView)findViewById(R.id.windownet);
        net.setText(txtnet);

        TextView longitude = (TextView)findViewById(R.id.longitude);
        longitude.setText(txtlongitude);

        ImageView fuseeimage = (ImageView)findViewById(R.id.fusee_image);
        Picasso.with(this)
                .load(txtfuseeimage)
                .into(fuseeimage);

        ImageView agenciesimage =  (ImageView)findViewById(R.id.agencies_image);
        Picasso.with(this)
                .load(txtagenciesimage)
                .into(agenciesimage);


    }
/*
    private void getIncomingIntent() {
        Log.d(TIG, "getIncommingIntent: checking for incomming intents.");


        if (getIntent().hasExtra("rocketname")&&
            getIntent().hasExtra("rocketconfig")&&
            getIntent().hasExtra("rocketfamilly")&&
            getIntent().hasExtra("rcname")&&
            getIntent().hasExtra("rcabbrev")&&
            getIntent().hasExtra("countrycode")&&
            getIntent().hasExtra("fuseeimage")&&
            getIntent().hasExtra("agenciesimage")&&
            getIntent().hasExtra("mission")&&
            getIntent().hasExtra("windowstart")&&
            getIntent().hasExtra("windowend")&&
            getIntent().hasExtra("net")&&
            getIntent().hasExtra("location")&&
            getIntent().hasExtra("padname")&&
            getIntent().hasExtra("latitude")&&
            getIntent().hasExtra("longitude")&&
            getIntent().hasExtra("padagencies")&&
            getIntent().hasExtra("missionname")&&
            getIntent().hasExtra("description")&&
            getIntent().hasExtra("typemission")&&
            getIntent().hasExtra("lspname")&&
            getIntent().hasExtra("lspabrrev")&&
            getIntent().hasExtra("lspcountrycode")&&
            getIntent().hasExtra("agenciesname")&&
            getIntent().hasExtra("agenciesabbrev")) {

            Log.d(TIG, "getIncomingIntent: found intent extras");
            {

                String txtrocketname=getIntent().getStringExtra("rocketname");
                String txtrocketconfiguration=getIntent().getStringExtra("rocketconfiguration");
                String txtrocketfamilly=getIntent().getStringExtra("rocketfamilly");
                String txtrcname=getIntent().getStringExtra("rcname");
                String txtrcabbrev=getIntent().getStringExtra("rcabbrev");
                String txtcountrycode=getIntent().getStringExtra("countrycode");
                String txtfuseeimage=getIntent().getStringExtra("fuseeimage");
                String txtagenciesimage=getIntent().getStringExtra("agenciesimage");
                String txtmission=getIntent().getStringExtra("mission");
                String txtwindowstart=getIntent().getStringExtra("windowstart");
                String txtwindowend=getIntent().getStringExtra("windowend");
                String txtnet=getIntent().getStringExtra("net");
                String txtlocation=getIntent().getStringExtra("location");
                String txtpadname=getIntent().getStringExtra("padname");
                String txtlatitude=getIntent().getStringExtra("latitude");
                String txtlongitude=getIntent().getStringExtra("longitude");
                String txtpadagencies=getIntent().getStringExtra("padagencies");
                String txtmissionname=getIntent().getStringExtra("missionname");
                String txtdescription=getIntent().getStringExtra("description");
                String txttypemission=getIntent().getStringExtra("typemission");
                String txtlspname=getIntent().getStringExtra("lspname");
                String txtlspcountrycode=getIntent().getStringExtra("lspcountrycode");
                String txtagenciesname=getIntent().getStringExtra("agenciesname");
                String txtlspabrrev=getIntent().getStringExtra("lspabrrev");
                String txtagenciesabbrev=getIntent().getStringExtra("agenciesabbrev");

/*
                setter(txtrocketname,
                        txtrocketconfiguration,
                        txtrocketfamilly,
                        txtrcname,
                        txtrcabbrev,
                        txtcountrycode,
                        txtfuseeimage,
                        txtagenciesimage,
                        txtmission,
                        txtwindowstart,
                        txtwindowend,
                        txtnet,
                        txtlocation,
                        txtpadname,
                        txtlatitude,
                        txtlongitude,
                        txtpadagencies,
                        txtmissionname,
                        txtdescription,
                        txttypemission,
                        txtlspname,
                        txtlspabrrev,
                        txtlspcountrycode,
                        txtagenciesname,
                        txtagenciesabbrev);
            }
        }
    }*/

}
