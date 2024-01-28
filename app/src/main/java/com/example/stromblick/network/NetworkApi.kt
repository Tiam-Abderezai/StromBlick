package com.example.stromblick.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface NetworkApi {
    @GET("GetErweiterteOeffentlicheEinheitStromerzeugung")
    suspend fun getPowerGenerationUnit(
        @Query("filter") filter: String,
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int,
    ): Response<NetworkResponse>
}
