package com.eliandaiva.retrofitandroid.API.RetrofitHelper;

import com.eliandaiva.retrofitandroid.API.Model.Products;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by eliandaiva on 8/19/16.
 */
public interface SearchService {
    @GET("Search")
    Call<Products> listProduct(@Query("term") String term);
}
