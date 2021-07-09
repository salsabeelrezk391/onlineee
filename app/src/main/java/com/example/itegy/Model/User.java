package com.example.itegy.Model;

public class User {
    private String id;
    private String name;
    private String email;
    private String country;
    private String adress_detail;
    private int img;

    private String error_msg;

    public User() {



    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getAdress_detail() {
        return adress_detail;
    }

    public void setAdress_detail(String adress_detail) {
        this.adress_detail = adress_detail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

}