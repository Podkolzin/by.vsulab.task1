package by.vgulab;

import by.vgulab.chef.Rustic;
import by.vgulab.chef.Vinaigrette;

public class Main {
    public static void main(String[] args) {
//        System.out.println("test");
//        Carrot carrot = new Carrot(0);
//        System.out.println(carrot.toString());
//        ArrayList <Vegetable> test = new ArrayList<>();
//        test.add(carrot);
//        carrot.getCalorieContent();
//
//        Salad salad = new Salad();
//        salad.addIngredient(new Pepper());

//        ChefСreator chef = new ChefСreator();
//
//        chef.showOptions();


        // создание обьектов салатов
        Vinaigrette vinaigrette = new Vinaigrette();
        Rustic rustic = new Rustic();


        // вывоз ингредиентов
        vinaigrette.showIngredient();
        rustic.showIngredient();


        // сортировка по калорийности ингредиентов
        vinaigrette.sortIngredientByCalories();
        rustic.sortIngredientByCalories();
        vinaigrette.showIngredient();
        rustic.showIngredient();

        // сортировка по весу ингредиентов
        vinaigrette.sortIngredientByWeight();
        rustic.sortIngredientByWeight();
        vinaigrette.showIngredient();
        rustic.showIngredient();

        // Найти овощи в салате, соответствующие заданному диапазону калорийности.
        vinaigrette.rangeCalories(20.0, 40.0);
        rustic.rangeCalories(7.0, 35.0);


    }
}

