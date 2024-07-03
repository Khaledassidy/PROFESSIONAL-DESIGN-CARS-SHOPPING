package com.example.professionaldesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Details_activity extends AppCompatActivity {
    ImageView back,favicon,car_image,star_icon,capacity_icon,engine_icon,speed_icon;
    TextView cardetails,title,rating,description_car,capacity_text,capacity_output,speed_text,speed_output,engine_text,engine_output,price_text,price_output;
    Button button_buy;
    boolean flag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        back=findViewById(R.id.back);
        favicon=findViewById(R.id.fav_icon);
        car_image=findViewById(R.id.car_details);
        cardetails=findViewById(R.id.cardes);
        title=findViewById(R.id.title);
        star_icon=findViewById(R.id.imageView_star);
        rating=findViewById(R.id.ratingtext);
        capacity_icon=findViewById(R.id.total_capacity_image);
        engine_icon=findViewById(R.id.engine_image);
        speed_icon=findViewById(R.id.maximum_speed_image);
        description_car=findViewById(R.id.description_car);
        capacity_text=findViewById(R.id.totla_capaicity_text);
        capacity_output=findViewById(R.id.totla_capaicity);
        speed_text=findViewById(R.id.maximum_speed_text);
        speed_output=findViewById(R.id.maximum_speed);
        engine_text=findViewById(R.id.engine_output_text);
        engine_output=findViewById(R.id.engine_output);
        button_buy=findViewById(R.id.add_cart);
        price_text=findViewById(R.id.price_text);
        price_output=findViewById(R.id.pricr_in_dollar);
        Intent intent=getIntent();
        if(intent!=null){
            car car=(car)intent.getSerializableExtra("data");
            description_car.setText("A car, or an automobile, is a motor vehicle with wheels. Most definitions of cars state that they run primarily on roads, seat one to eight people, have four wheels, and mainly transport people, not cargo");
            car_image.setImageResource(car.getCar_image());
            rating.setText(car.getRating());
            capacity_text.setText(car.getCapacity());
            speed_text.setText(car.getMaximum_speed());
            engine_text.setText(car.getEngine_output());
            price_output.setText(car.getPrice());
            title.setText(car.getTitle());
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Details_activity.this, "congrats", Toast.LENGTH_SHORT).show();
            }
        });

        favicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true){
                    favicon.setImageResource(R.drawable.red_heart);
                    flag=false;

                } else if (flag==false) {
                    favicon.setImageResource(R.drawable.fav_icon);
                    flag=true;
                }


            }
        });


    }
}