package com.example.professionaldesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class costumeaddapter extends BaseAdapter {
    Context context;
    int resource;
    ArrayList<car> arrayList;

    public costumeaddapter( Context context, int resource, ArrayList<car> arrayList){
        this.context=context;
        this.resource=resource;
        this.arrayList=arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public car getItem(int position) {
        return arrayList.get(position);
    }
    public  void additem(car car){
        arrayList.add(car);
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=convertView;
        if(view==null){
            view= LayoutInflater.from(this.context).inflate(resource,parent,false);
        }
        ImageView imageView=view.findViewById(R.id.imagecar);
        TextView textView=view.findViewById(R.id.title_car);
        TextView textView1=view.findViewById(R.id.price);
        car car=getItem(position);
        imageView.setImageResource(car.getCar_image());
        textView.setText(car.getTitle());
        textView1.setText(car.getPrice());
        return view;
    }
}
