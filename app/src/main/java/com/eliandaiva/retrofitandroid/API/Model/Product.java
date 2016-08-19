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


    // getter and setter
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(Integer priceNew) {
        this.priceNew = priceNew;
    }

    public Integer getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(Integer priceOld) {
        this.priceOld = priceOld;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public interface API{
        @GET("catalog")
        Call<ResultData> catalog();
    }

    public void printData(){
        Log.d("product", name);
        Log.d("product", id);
        Log.d("product", picture);
        Log.d("product", ""+priceNew);
        Log.d("product", category);
        Log.d("product", description);
        Log.d("product", ""+priceOld);
    }

}
