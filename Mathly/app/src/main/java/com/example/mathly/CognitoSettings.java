package com.example.mathly;

import android.content.Context;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool;
import com.amazonaws.regions.Regions;

public class CognitoSettings {

    private String userPoolId = "us-east-2_9jhVp0Fqb";
    private String clientId = "44j9kel98rcl5q55tcda8vl31e";
    private String clientSecret = "1uhmtu0pa8555b50ku1gflfk842bf24d05muf935f9fjic8977b1";
    private Regions cognitoRegion = Regions.US_EAST_2;



    private Context context;

    public CognitoSettings(Context context){
        this.context = context;
    }

    public String getUserPoolId(){
        return userPoolId;
    }

    public String getClientId(){
        return clientId;
    }

    public Regions getCognitoRegion(){
        return cognitoRegion;
    }

    public CognitoUserPool getUserPool(){
        return new CognitoUserPool(context,userPoolId,clientId,clientSecret,cognitoRegion);
    }



















}
