package by.vgulab;

import by.vgulab.food.Carrot;
import by.vgulab.food.Vegetable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        Carrot carrot = new Carrot(0);
        System.out.println(carrot.toString());
        ArrayList <Vegetable> test = new ArrayList<>();
        test.add(carrot);
        carrot.getCalorieContent();
    }
}

