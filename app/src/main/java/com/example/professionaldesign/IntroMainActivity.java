package com.example.professionaldesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class IntroMainActivity extends AppCompatActivity {

    TextView intro_text,into_text1;
    ImageView imge_intro;
    Button getstrat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_main);
        intro_text=findViewById(R.id.intro_text);
        into_text1=findViewById(R.id.welcome);
        imge_intro=findViewById(R.id.intro_image);
        getstrat=findViewById(R.id.getstart);

        getstrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}