package com.example.spacelaunch_appli;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static java.lang.reflect.Array.set;

public class infoLaunch extends AppCompatActivity {


    private final String TIG = "information";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);
        Log.d(TIG, "onCreate:started");
        getIncomingIntent();
    }


    private void set(String txtrocketname, String txtrocketconfig, String txtrocketfamilly, String txtrcname,
                     String txtrcabbrev, String txtcountrycode, String txtfuseeimage, String txtagenciesimage,
                     String txtmission, String txtwindowstart, String txtwindowend, String txtnet,
                     String txtlocation, String txtpadname, String txtlatitude, String txtlongitude,
                     String txtpadagencies, String txtmissionname, String txtdescription,
                     String txttypemission, String txtlspname, String txtlspabrrev,
                     String txtlspcountrycode, String txtagenciesname, String txtagenciesabbrev) {


        TextView padagencies = findViewById(R.id.padagencies);
        padagencies.setText(txtpadagencies);

        TextView missionname = findViewById(R.id.missionname);
        missionname.setText(txtmissionname);

        TextView description = findViewById(R.id.description);
        description.setText(txtdescription);

        TextView typemission = findViewById(R.id.typemission);
        typemission.setText(txttypemission);

        TextView lspname = findViewById(R.id.lspname);
        lspname.setText(txtlspname);

        TextView lspabrrev = findViewById(R.id.lspabrrev);
        lspabrrev.setText(txtlspabrrev);

        TextView lspcountrycode = findViewById(R.id.lspcountrycode);
        lspcountrycode.setText(txtlspcountrycode);

        TextView agenciesname = findViewById(R.id.titre_agency);
        agenciesname.setText(txtagenciesname);

        TextView agenciesabbrev = findViewById(R.id.agenciesabbrev);
        agenciesabbrev.setText(txtagenciesabbrev);

        TextView location = findViewById(R.id.location);
        location.setText(txtlocation);

        TextView padname = findViewById(R.id.padname);
        padname.setText(txtpadname);

        TextView rocketfamilly = findViewById(R.id.rocketfamilyname);
        rocketfamilly.setText(txtrocketfamilly);

        TextView latitude = findViewById(R.id.latitude);
        latitude.setText(txtlatitude);

        TextView rocketname = findViewById(R.id.rocketname);
        rocketname.setText(txtrocketname);

        TextView rocketconfig = findViewById(R.id.rocketconfiguration);
        rocketconfig.setText(txtrocketconfig);

        TextView rcname = findViewById(R.id.rcname);
        rcname.setText(txtrcname);

        TextView rcabbrev = findViewById(R.id.rcabbrev);
        rcabbrev.setText(txtrcabbrev);

        TextView countrycode = findViewById(R.id.rccountrycode);
        countrycode.setText(txtcountrycode);

        TextView mission = findViewById(R.id.missionname);
        mission.setText(txtmission);

        TextView windowstart = findViewById(R.id.windowstart);
        windowstart.setText(txtwindowstart);

        TextView windowend = findViewById(R.id.windowend);
        windowend.setText(txtwindowend);

        TextView net = findViewById(R.id.windownet);
        net.setText(txtnet);

        TextView longitude = findViewById(R.id.longitude);
        longitude.setText(txtlongitude);

        ImageView fuseeimage = findViewById(R.id.fusee_image);
        Picasso.with(this)
                .load(txtfuseeimage)
                .into(fuseeimage);

        ImageView agenciesimage = findViewById(R.id.agencies_image);
        Picasso.with(this)
                .load(txtagenciesimage)
                .into(agenciesimage);

    }

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
                String txtrocketconfig=getIntent().getStringExtra("rocketconfig");
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


                set(txtrocketname,txtrocketconfig,txtrocketfamilly,txtrcname,txtrcabbrev,txtcountrycode,txtfuseeimage,txtagenciesimage,txtmission,txtwindowstart,txtwindowend,txtnet,txtlocation,txtpadname,txtlatitude,txtlongitude,txtpadagencies,txtmissionname,txtdescription,txttypemission,txtlspname,txtlspabrrev,txtlspcountrycode,txtagenciesname,txtagenciesabbrev);
            }
        }
    }

}
