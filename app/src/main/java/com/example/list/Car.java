package com.example.list;

public class Car {

    String photo;
    String title;
    String desc;
    String country;

    public Car(String photo, String title, String desc, String country){
        this.photo = photo;
        this.title = title;
        this.desc = desc;
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getCountry() {
        return country;
    }
}
