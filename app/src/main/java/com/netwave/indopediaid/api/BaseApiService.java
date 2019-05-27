package com.netwave.indopediaid.api;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.netwave.indopediaid.viewmodels.catalog.*;


import org.json.JSONObject;

public class BaseApiService implements IBaseApiService {

    public HomeModel hModel = new HomeModel();
    public ProductModel pModel = new ProductModel();

    public HomeModel GetHomeModelFromApiUrl(String url){

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonBody = new JSONObject(response.toString());
                            Gson gson= new Gson();
                            HomeModel mdl = gson.fromJson(jsonBody.toString(),HomeModel.class);
                            hModel=mdl;

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error Response", error.toString());
            }
        });
        return hModel;
    }
    public ProductModel GetProductModelFromApiUrl(String url){

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonBody = new JSONObject(response.toString());
                            Gson gson= new Gson();
                            ProductModel mdl = gson.fromJson(jsonBody.toString(), ProductModel.class);
                            pModel=mdl;

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error Response", error.toString());
            }
        });
        return pModel;
    }
}
