package com.example.mathly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUser;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserAttributes;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserCodeDeliveryDetails;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//       registerUser();

    }
//    private void registerUser(){
//
//          final TextInputEditText inputName = findViewById(R.id.username_edit);
//          final TextInputEditText inputPassword  = findViewById(R.id.password_edit);
//          final TextInputEditText inputEmailAddress = findViewById(R.id.emailaddress_edit);
//
//
//
//        final CognitoUserAttributes userAttributes = new CognitoUserAttributes();
//
//        final SignUpHandler signUpCallback = new SignUpHandler() {
//            @Override
//            public void onSuccess(CognitoUser user, boolean signUpConfirmationState,
//                                  CognitoUserCodeDeliveryDetails cognitoUserCodeDeliveryDetails) {
//
//                Log.i(TAG,"Sign up successful: " + signUpConfirmationState);
//
//                if(!signUpConfirmationState){
//                    Log.i(TAG,"Sign up unsuccessful: " + cognitoUserCodeDeliveryDetails.getDestination());
//                } else {
//                    Log.i(TAG,"Sign up successful");
//                }
//            }
//
//            @Override
//            public void onFailure(Exception exception) {
//                Log.i(TAG,"Sign up successful: " + exception.getLocalizedMessage());
//
//            }
//        };
//
//        Button buttonRegister = findViewById(R.id.signup_butt);
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                userAttributes.addAttribute("give_name", String.valueOf(inputName.getText()));
//                userAttributes.addAttribute("give_password",String.valueOf(inputPassword.getText()));
//                userAttributes.addAttribute("give_email",String.valueOf(inputEmailAddress.getText()));
//
//
//                CognitoSettings cognitoSettings = new CognitoSettings(Register.this);
//                cognitoSettings.getUserPool().signUpInBackground(String.valueOf(inputName.getText()),
//                        String.valueOf(inputPassword.getText()), userAttributes,
//                        null,signUpCallback);
//                Log.i(TAG,"YO IM HERE");
//            }
//        });
//
//
//
//
//    }
//





}
