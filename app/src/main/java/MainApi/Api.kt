package MainApi

import MainApi.PostResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET("gambar")
    fun getPosts(): Call<ArrayList<PostResponse>>
}