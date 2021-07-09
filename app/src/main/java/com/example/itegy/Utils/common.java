package com.example.itegy.Utils;

import com.example.itegy.retrofit.IOnlineShoppingAPI;
import com.example.itegy.retrofit.RetrofitClient;

public class common {
    private static final String BASE_URL = "http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=online_shopping_project";
    public static IOnlineShoppingAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IOnlineShoppingAPI.class);
    }
}
