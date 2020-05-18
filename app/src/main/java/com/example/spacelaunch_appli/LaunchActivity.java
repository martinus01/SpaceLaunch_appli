package com.example.spacelaunch_appli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LaunchActivity extends AppCompatActivity {


    private final String BASE_URL="https://raw.githubusercontent.com/martinus01/SpaceLaunch_appli/develop/";
    private RecyclerView recyclerView;
    private Listadapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private SharedPreferences sharedPreferences;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        sharedPreferences = getSharedPreferences("application_esiea", Context.MODE_PRIVATE);
        gson = new GsonBuilder()
                .setLenient()
                .create();
        List<Launch> launchList= getDataFromCache();

        if(launchList !=null) {
            showList(launchList);
        }else{
            makeApiCall();
        }
    }
    private List<Launch> getDataFromCache(){
        String jsonLaunch=sharedPreferences.getString("jsonLaunch",null);
        if(jsonLaunch==null) {
            return null;
        }else{
            Type listType= new TypeToken<List<Launch>>(){}.getType();
            return gson.fromJson(jsonLaunch,listType);
        }
    }


    private void showList(List<Launch> launchlist) {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //context=context;

        // define an adapter
        mAdapter = new Listadapter(launchlist,this);
        recyclerView.setAdapter(mAdapter);
    }


    private void makeApiCall(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        Launchlibrary launchlibrary = retrofit.create(Launchlibrary.class);

        Call<RestLaunchResponse> call = launchlibrary.getLaunchResponse();
        call.enqueue(new Callback<RestLaunchResponse>() {
            @Override
            public void onResponse(Call<RestLaunchResponse> call, Response<RestLaunchResponse> response) {
                if(response.isSuccessful() && response.body() != null){
                    List<Launch> launchlist=response.body().getLaunches();
                    //  Toast.makeText(getApplicationContext(), "API Success", Toast.LENGTH_SHORT).show();
                    saveList(launchlist);
                    showList(launchlist);
                }else{
                    showError();
                }
            }

            @Override
            public void onFailure(Call<RestLaunchResponse> call, Throwable t) {
                showError();
            }
        });

    }

    private void saveList(List<Launch> launchList) {
        String jsonString= gson.toJson(launchList);

        sharedPreferences
                .edit()
                .putString("jsonLaunch", jsonString)
                .apply();

        Toast.makeText(getApplicationContext(), "List Save", Toast.LENGTH_SHORT).show();
    }

    private void showError() {
        Toast.makeText(getApplicationContext(), "API Error", Toast.LENGTH_SHORT).show();
    }


}
//todo LAUNCH PREVIUOUS AND NEXT