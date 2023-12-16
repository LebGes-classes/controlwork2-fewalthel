package com.example;

//подмножество работников магазина
public class Worker extends Human {
    public String surname;
    public String dolzhnost;

    Worker(String dolzhnost){
        this.dolzhnost = dolzhnost;
        this.surname = fullname.split(" ")[0]; //разделяем строку с фамилией и именем и для получения фамилии берем первый элемент массива
    }

    @Override
    public void PrintInfo() {
        System.out.println("Фамилия: "+this.surname
                +"\nДолжность:"+this.dolzhnost);
    }

}
