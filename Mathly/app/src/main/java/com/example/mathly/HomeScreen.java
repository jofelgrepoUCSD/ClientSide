package com.example.mathly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    private Button scan_button;
    private Button upload_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        scan_button = findViewById(R.id.scan_button);
        scan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScan();

            }
        });
    }
    public void openScan(){
        Intent i = new Intent(this, ScanImage.class);
        startActivity(i);
    }

}
