package com.example.spacelaunch_appli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private final int SPLASH_SCREEN_DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // rediriger ver la page main_activity après 3 secondes.
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                //demarer la page
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // handler post delayed
        new Handler().postDelayed(runnable,SPLASH_SCREEN_DELAY);

    }
}
//TODO (possibilité d'afficher un message d'erreur si Pas de donnée