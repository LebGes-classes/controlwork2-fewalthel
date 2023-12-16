package com.example;

public abstract class Human {
    //полное имя задается так: Фамилия Имя
    //в наследуемых классах для получения отдельно имени и отдельно фамилии мы будет создавать массив из имени и фамилии с помощью метода split
    public String name;
    public String surname;

    public void PrintInfo() {
        System.out.println("Фамилия и имя: "+this.name+" "+this.surname);
    }

}
