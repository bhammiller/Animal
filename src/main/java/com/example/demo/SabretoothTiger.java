package com.example.demo;

public class SabretoothTiger extends Animal {

    public SabretoothTiger()
    {
        super();
        System.out.println("Now I am a Sabretooth Tiger!");
    }

    @Override
    public String sleep() {
        return "A cat Sabretooth Tiger...";
    }

    @Override
    public String eat() {
        return "A cat Sabretooth Tiger...";
    }

    public String roar(){
        return "ROAR!!...";
    }


}