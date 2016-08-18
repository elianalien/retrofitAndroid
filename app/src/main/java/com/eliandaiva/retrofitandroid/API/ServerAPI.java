package com.eliandaiva.retrofitandroid.API;

/**
 * Created by eliandaiva on 8/19/16.
 */
import android.os.StrictMode;

import com.eliandaiva.retrofitandroid.API.Model.Product;
import com.eliandaiva.retrofitandroid.API.Model.ResultData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eliandaiva on 8/18/16.
 */
public class ServerAPI {

    String BASE_URL = "http://xxx.com/public/api/";

    Retrofit retrofit;


    public ServerAPI() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public List<Product> exploreProduct() {
        List<Product> products = new ArrayList<>();

        try {
            Product.API api = retrofit.create(Product.API.class);
            Call<ResultData> resultDataCall = api.catalog();
            products = resultDataCall.execute().body().productCatalog;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    public List<Product> exploreCloth() {
        List<Product> cloths = exploreProduct();

        for (int j = 0; j < cloths.size(); j++) {
            if (cloths.get(j).category != "pakaian") {
                cloths.remove(j);
            }
        }

        return cloths;
    }

    public List<Product> exploreAccessories() {
        List<Product> accessories = exploreProduct();

        for (int j = 0; j < accessories.size(); j++) {
            if (accessories.get(j).category != "aksesoris") {
                accessories.remove(j);
            }
        }

        return accessories;
    }

    public List<Product> exploreCraft() {
        List<Product> craft = exploreProduct();

        for (int j = 0; j < craft.size(); j++) {
            if (craft.get(j).category != "kriya") {
                craft.remove(j);
            }
        }

        return craft;
    }

}
