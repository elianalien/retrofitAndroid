package com.eliandaiva.retrofitandroid.API;

/**
 * Created by eliandaiva on 8/19/16.
 */
public class Constants {
    public static final String CONSUMER_KEY = "0be4244b759e597e192c62f220386d53";
    //You Custom Consumer SECRET
    public static final String CONSUMER_SECRET = "43f2a9168877a2cf5447103233661a50";
    //Your Base URL for the site
    public static final String BASE_URL = "http://xxx.test.yyy/";

    public static final String REQUEST_URL 		= BASE_URL + "oauth/initiate";
    public static final String ACCESS_URL 		= BASE_URL + "oauth/token";
    public static final String AUTHORIZE_URL 	= BASE_URL + "oauth/authorize";
    public static final String API_REQUEST 		= BASE_URL + "api/rest/";

    public static final String PRODUCT_API_REQUEST 		=   API_REQUEST+"products";

    public static final String ENCODING 		= "UTF-8";

    public static final String OAUTH_CALLBACK_URL = "http://localhost/";
}
