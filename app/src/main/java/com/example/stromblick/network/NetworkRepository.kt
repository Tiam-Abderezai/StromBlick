package com.example.stromblick.network

interface NetworkRepository {
    suspend fun getPowerGenerationUnit(filter: String, page: Int, pageSize: Int): Resource<NetworkResponse>
}
