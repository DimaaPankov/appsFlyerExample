package com.example2.testproject.model

import com.example2.testproject.model.models.JsonData
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "http://81.28.6.15/"

val okHttpClient: OkHttpClient = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
    .build()

val retrofit: Retrofit = Retrofit.Builder()
    .client(okHttpClient)
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


interface ApiService {
    @GET("click_api/v3")
    suspend fun getData(
        @Query("token") token: String /*= "yzby7zvd5swwhm4fzrbvl93fsbm1sbk7"*/,
        @Query("log") log: String = "1",
        @Query("info") info: String = "1",
    ): JsonData
}

object RetrofitApi {
    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}