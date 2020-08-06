package com.example.mathly.data.remote;
import com.example.mathly.data.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {


    /** indicates we want to execute a POST request
     *  the full URL will be
     *  http://jsonplaceholder.typicode.com/posts
     */

//    @POST("/posts")
//    @FormUrlEncoded
//    Call<Post> savePost(@Field("base64") String base64,
//                        @Field("userId") long userId);

    @Headers({"Accept: application/json"})

    @POST("Prod/api/pictures")
    Call<Post> createPost(@Body Post post);

    @POST("api/pictures")
    @FormUrlEncoded
    Call<Post> savePost(@Field("name") String name,
                        @Field("base64data") String base64data,
                        @Field("type") String type,
                        @Field("size") Integer size);

}
