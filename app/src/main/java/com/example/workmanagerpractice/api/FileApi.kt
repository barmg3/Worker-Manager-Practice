package com.example.workmanagerpractice.api

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/photos/W9f-PrkRqk0/download?ixid=MnwxMjA3fDB8MXxzZWFyY2h8MTd8fGFuZHJvaWR8ZW58MHx8fHwxNjQ3NDI5MDg3&force=true")
    suspend fun downloadImage() : Response<ResponseBody>

    companion object{
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://unsplash.com")
                .build()
                .create(FileApi::class.java)
        }
    }
}