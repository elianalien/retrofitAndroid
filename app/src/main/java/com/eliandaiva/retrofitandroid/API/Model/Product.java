package com.eliandaiva.retrofitandroid.API.Model;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class Product {
    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("picture")
    @Expose
    public String picture;

    @SerializedName("priceNew")
    @Expose
    public Integer priceNew;

    @SerializedName("priceOld")
    @Expose
    public Integer priceOld;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("category")
    @Expose
    public String category;

    public interface API{
        @GET("catalog")
        Call<ResultData> catalog();
    }

    public void printData(){
        Log.d("product", name);
        Log.d("product", id);
        Log.d("product", ""+priceNew);
        Log.d("product", category);
        Log.d("product", description);
        Log.d("product", ""+priceOld);
    }

}
