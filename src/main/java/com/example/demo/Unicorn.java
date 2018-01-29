package com.example.demo;

public class Unicorn extends Animal {

    public Unicorn()
    {
        super();
        System.out.println("Now I am a Unicorn!");
    }

    @Override
    public String sleep() {
        return "A Unicorn sleeps...";
    }

    @Override
    public String eat() {
        return "A Unicorn eats...";
    }

    public String purr(){
        return "purrr...";
    }



}
