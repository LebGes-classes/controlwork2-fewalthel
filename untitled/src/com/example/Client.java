package com.example;

//подмножество посетителей магазина

public class Client extends Human {
    public String name;
    public int age;

    Client(int age){
        this.age = age;
        this.name = fullname.split(" ")[1]; //разделяем строку с фамилией и именем и для получения фамилии берем второй элемент массива
    }

    @Override
    public void PrintInfo() {
        System.out.println("Имя: "+this.name
                +"\nВозраст:"+this.age);
    }
}
