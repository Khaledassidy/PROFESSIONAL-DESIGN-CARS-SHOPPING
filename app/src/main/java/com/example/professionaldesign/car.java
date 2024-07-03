package com.example.professionaldesign;

import java.io.Serializable;

public class car implements Serializable {
    int car_image;
    String Title;
    String price;
    String capacity;
    String maximum_speed;
    String engine_output;
    String rating;

    public car(int car_image, String title, String price,String capacity, String maximum_speed,String engine_output, String rating) {
        this.car_image = car_image;
        Title = title;
        this.price = price;
        this.capacity=capacity;
        this.maximum_speed=maximum_speed;
        this.engine_output=engine_output;
        this.rating=rating;

    }


    public int getCar_image() {
        return car_image;
    }

    public void setCar_image(int car_image) {
        this.car_image = car_image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMaximum_speed() {
        return maximum_speed;
    }

    public void setMaximum_speed(String maximum_speed) {
        this.maximum_speed = maximum_speed;
    }

    public String getEngine_output() {
        return engine_output;
    }

    public void setEngine_output(String engine_output) {
        this.engine_output = engine_output;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
