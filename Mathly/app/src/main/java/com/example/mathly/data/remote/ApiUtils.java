package com.example.mathly.data.remote;

import retrofit2.Retrofit;

public class ApiUtils {

    private ApiUtils(){}

    public static final String BASE_URL = "https://qonbfsyvbf.execute-api.us-west-1.amazonaws.com/Prod/api/pictures/";

    public static APIService getAPIService(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
