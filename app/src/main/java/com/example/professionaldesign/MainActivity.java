package com.example.professionaldesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    GridView gridView;
    ArrayList<car> arrayList;
    costumeaddapter costumeaddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.grid);
        arrayList=new ArrayList<>();
        costumeaddapter=new costumeaddapter(this,R.layout.view,arrayList);
        data();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                car car=costumeaddapter.getItem(position);
                if(car!=null){
                    Intent intent=new Intent(getApplicationContext(), Details_activity.class);
                    int imageresoure=car.getCar_image();
                    String title=car.getTitle();
                    String price=car.getPrice();
                    String capacity=car.getCapacity();
                    String maximumspeed=car.getMaximum_speed();
                    String rating=car.getRating();
                    String engine=car.getEngine_output();
                    car new_car=new car(imageresoure,title,price,capacity,maximumspeed,engine,rating);
                    intent.putExtra("data",new_car);
                    startActivity(intent);
                }
            }
        });



    }

    public void data(){
        car car1=new car(R.drawable.ford,"Ford F-150","$120,999","4","220 KM/H","200hp","4.5");
        car car2=new car(R.drawable.bmw,"BMW iX","$150,999","3","300 KM/H","250hp","4");
        car car3=new car(R.drawable.honda,"Honda Odyssey","$100,999","4","240 KM/H","220hp","4.5");
        car car5=new car(R.drawable.tesla,"Tesla Model 3","$150,999","3","220 KM/H","300hp","4");
        car car6=new car(R.drawable.ranglejeep,"Jeep Wrangler","$90,999","4","250 KM/H","300hp","4");
        car car8=new car(R.drawable.toyota,"Toyota Highlander","$112,999","4","230 KM/H","400hp","4.5");
        car car9=new car(R.drawable.benz,"Mercedes-Benz E-Class","$200,999","3","400 KM/H","650hp","5");
        car car10=new car(R.drawable.hyndia1,"Hyundai Santa Fe","$20,999","3","220 KM/H","690hp","4.75");
        car car7=new car(R.drawable.ferari,"Ferrari F8 Tributo","$500,999","2","500 KM/H","700hp","5");
        car car11=new car(R.drawable.ferarinum,"Ferrari SF90","$400,999","4","220 KM/H","200hp","4.5");
        costumeaddapter.additem(car1);
        costumeaddapter.additem(car2);
        costumeaddapter.additem(car3);
        costumeaddapter.additem(car5);
        costumeaddapter.additem(car6);
        costumeaddapter.additem(car7);
        costumeaddapter.additem(car8);
        costumeaddapter.additem(car9);
        costumeaddapter.additem(car10);
        costumeaddapter.additem(car11);
        gridView.setAdapter(costumeaddapter);
    }
}