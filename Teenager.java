package com.company;

public class Teenager extends Person{

    public Teenager(String name, int id){

    }
    @Override
    public void voice(){
        System.out.println("Здарова!");
    }
    @Override
    public void eat(){
        System.out.println("Фу! Брокколи");
    }
}
