package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {


    @Headers(
        "X-RapidAPI-Key: 5c44d861d9mshe96829b7f84a7c2p1a974fjsn20a3ff0b2c56",
        "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com"
    )

    @GET("search")
    fun getData(@Query("q") query: String): Call<MyData>
}
