package com.camavilca.orlando.myapplication.services;

import com.camavilca.orlando.myapplication.model.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    String API_BASE_URL = "https://productos-apj-ebenites.c9users.io";

    @GET("/api/productos/")
    Call<List<Producto>> getProductos();

}
