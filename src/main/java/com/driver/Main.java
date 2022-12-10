package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

        //obj.name="Areeb";  //error will throw

        obj.setName("Areeb");
        obj.getName();
    }
}