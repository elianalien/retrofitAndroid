package com.eliandaiva.retrofitandroid.API.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class Review {
    @SerializedName("Rating")
    @Expose
    public Integer rating;

    @SerializedName("TextReview")
    @Expose
    public String textReview;

    @SerializedName("ReviewDate")
    @Expose
    public String reviewDate;

    @SerializedName("TotalRating")
    @Expose
    public Integer totalRating;

}
