package com.example;

//подмножество посетителей магазина

public class Client extends Human {
    public int age;

    Client(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Имя: "+this.name
                +"\nВозраст:"+this.age);
    }
}
