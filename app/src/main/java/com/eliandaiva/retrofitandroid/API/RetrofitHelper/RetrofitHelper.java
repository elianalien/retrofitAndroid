package com.eliandaiva.retrofitandroid.API.RetrofitHelper;

import android.os.AsyncTask;

import com.eliandaiva.retrofitandroid.API.Model.Product;
import com.eliandaiva.retrofitandroid.API.Model.Products;
import com.eliandaiva.retrofitandroid.API.Model.ResultData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class RetrofitHelper extends AsyncTask<String, Void, List<Product>> {
    final static String URL_server = "http://xxx.yyy.zzz";

    String Query;

    public RetrofitHelper(String search){
        Query = search;
    }

    @Override
    protected List<Product> doInBackground(String... params){
        List<Product> response;
        Products products;

        Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(URL_server)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

        SearchService searchService = retrofit.create(SearchService.class);
        Call<Products> query = searchService.listProduct(this.Query);

        try{
            products = query.execute().body();
            if (products.getProducts().size()>0){
                response = products.getProducts();
            }
            else {
                response = new ArrayList<>();
            }
        }
        catch (IOException e){
            e.printStackTrace();
            response = new ArrayList<>();
        }

        return response;
    }
}
