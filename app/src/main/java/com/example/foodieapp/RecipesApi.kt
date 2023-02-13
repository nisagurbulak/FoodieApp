package com.example.foodieapp

import com.example.foodieapp.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface RecipesApi {

    @GET("/recipes/complexSearch")
    fun getRecipes(
        @QueryMap queries : Map<String,String>
    ) : Response<FoodRecipe>





}