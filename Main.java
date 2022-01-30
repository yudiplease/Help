package com.company;

public class Main {

    public static void main(String[] args) {

        Babushka babushka = new Babushka();
        Teenager teenager = new Teenager("Tim",1);
//        person.setAge(-15);

        teenager.eat();
        teenager.setAge(5);
        System.out.println(teenager.getAge());
        String y = "Hello";
        int z = 10;
    }
}
