package com.example.spacelaunch_appli;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Launchlibrary {
    @GET("upcomminglaunch.json")
    Call<RestLaunchResponse> getLaunchResponse();


}
