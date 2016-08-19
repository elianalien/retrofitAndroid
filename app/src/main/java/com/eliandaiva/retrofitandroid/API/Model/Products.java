package com.eliandaiva.retrofitandroid.API.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class Products {
    @SerializedName("productCount")
    @Expose
    private Integer productCount;

    @SerializedName("products")
    @Expose
    private List<Product> products = new ArrayList<Product>();

    public Integer getProductCount(){
        return productCount;
    }

    public void setProductCount(Integer productCount){
        this.productCount = productCount;
    }

    public List<Product> getProducts(){
        return products;
    }

    public void setProducts(List<Product> products){
        this.products = products;
    }
}
