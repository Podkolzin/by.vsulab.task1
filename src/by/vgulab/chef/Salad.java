package by.vgulab.chef;

import by.vgulab.food.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> ingredient = new ArrayList<Vegetable>();

    public Salad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<?> getIngredient() {
        return ingredient;
    }

    public void addIngredient(Vegetable ingredient) {
        this.ingredient.add(ingredient);
    }

    public void showIngredient() {
        if (!ingredient.isEmpty()) {
            System.out.println("В салате " + name + " есть");
            for (Vegetable vegetable : ingredient) {
                System.out.println(ingredient.toString());
                System.out.println("********************");
            }
        } else {
            System.out.println("Вы еще ничего не добавили");
            return;
        }
    }

    public double caloriecount() {
        double count = 0.0;
        for (Vegetable vegetable : ingredient) {
            count += vegetable.getTotalCalories();
        }
        return count;
    }

    public void sortIngredientByCalories() {
        Collections.sort(ingredient, new CaloriesComparator());
    }

    public void sortIngredientByWeight() {
        Collections.sort(ingredient, new WeightComparator());
    }

    public void rangeCalories(double lower, double upper) {
        double count;
        System.out.println("Вот список ингредиентов в заданном диапазоне ");
        for (Vegetable vegetable : ingredient) {
            count = vegetable.getCalorieContent();
            if (count <= lower && count >= upper) {
                System.out.println(vegetable.getName() + vegetable.getCalorieContent());
            }
        }
    }

}
