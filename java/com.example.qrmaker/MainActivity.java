package com.example.qrmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button buttonGenerate = (Button)findViewById(R.id.button);
        final EditText text = (EditText) findViewById(R.id.link);
        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String url_image="https://api.qrserver.com/v1/create-qr-code/?data="+text.getText().toString();
                ImageView ivBasicImage = (ImageView) findViewById(R.id.imageView);
                Picasso.get().load(url_image).into(ivBasicImage);

            }
        });
    }
}