package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human[] human = new Human[10];
        /*Client Petya = new Client(12);
        Worker KassirTatyana = new Worker("кассир");

        human[0] = Petya;
        human[1] = KassirTatyana;
        */
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            boolean flag = rand.nextBoolean();

            if (flag) { //создаем экземпляр подкласса client
                String name = Integer.toString(rand.nextInt());
                int age = rand.nextInt(90-10) + 10;
                human[i] = new Client(age);
            } else { //создаем экземпляр подкласса worker
                String name = Integer.toString(rand.nextInt());
                String dolzhnost = Integer.toString(rand.nextInt());
                human[i] = new Worker(dolzhnost);
            }
        }

        human[0].PrintInfo();

    }
}