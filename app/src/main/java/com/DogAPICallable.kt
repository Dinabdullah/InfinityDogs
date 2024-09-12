package com

import retrofit2.Call
import retrofit2.http.GET

interface DogAPICallable {

    @GET("/api/breeds/image/random")
    fun getImage(): Call<Dog>

}