package com.example.sanourtomal.gmailinbox.network;

import com.example.sanourtomal.gmailinbox.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sanour Tomal on 6/6/2017.
 */


public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
