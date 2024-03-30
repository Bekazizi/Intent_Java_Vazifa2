package com.example.intent_java_vazifa2.user;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
