package com.company;

public abstract class Person {
    private int age;
    private String name;
    private int id;


    public Person(String name, int id){
        this.age = 15;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка!");
        }
    }

    public Person(){
        this.age = 15;
        this.name = "Tim";
        this.id = 0;
    }
    public abstract void voice();

    public void eat(){
        System.out.println("Вкусные брокколи");
    }

}
