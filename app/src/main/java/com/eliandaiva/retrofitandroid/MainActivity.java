package com.eliandaiva.retrofitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eliandaiva.retrofitandroid.API.Model.Product;
import com.eliandaiva.retrofitandroid.API.ServerAPI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products = new ArrayList<>();
        products = new ServerAPI().exploreProduct();
    }
}
