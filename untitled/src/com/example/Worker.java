package com.example;

//подмножество работников магазина
public class Worker extends Human {
    public String dolzhnost;

    Worker(String dolzhnost, String surname) {
        this.dolzhnost = dolzhnost;
        this.surname = surname;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Фамилия: "+this.surname
                +"\nДолжность:"+this.dolzhnost);
    }
}