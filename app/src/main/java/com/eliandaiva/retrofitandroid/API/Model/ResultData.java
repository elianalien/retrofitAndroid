package com.eliandaiva.retrofitandroid.API.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class ResultData {
    @SerializedName("productCatalog")
    @Expose
    public List<Product> productCatalog = new ArrayList<>();
}
