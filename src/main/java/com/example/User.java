package com.example;

/**
 * Created by erikjakubowski on 1/27/17.
 */
public class User {

    public User(){

    }


    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
