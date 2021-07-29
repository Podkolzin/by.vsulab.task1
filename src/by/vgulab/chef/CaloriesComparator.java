package by.vgulab.chef;

import by.vgulab.food.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return (int) (o1.getCalorieContent() - o2.getCalorieContent());
    }
}
