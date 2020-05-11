package com.example.spacelaunch_appli;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class infoLaunch extends AppCompatActivity {
    private ImageView fuseeimage;
    private Context context;
    private List<Launch> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);

            TextView txtmission;
            TextView txtfusee;
            TextView txtagencies;
            View layout;
            String txtfuseeimage=getIntent().getStringExtra("fuseeimage");
            String txtagenciesimage=getIntent().getStringExtra("agencyimage");


                txtmission = (TextView) findViewById(R.id.titre_mission);
                txtfusee = (TextView) findViewById(R.id.rocketname);
                txtagencies = (TextView) findViewById(R.id.titre_agency);
                fuseeimage = (ImageView) findViewById(R.id.fusee_image);




            ImageView fuseeimage=findViewById(R.id.fusee_image);
        Picasso.with(this)
                .load(txtfuseeimage)
                .into(fuseeimage);

            ImageView  agenciesimage=findViewById(R.id.agencies_image);
            Picasso.with(this)
                    .load(txtagenciesimage)
                    .into(agenciesimage);
            }
        }
