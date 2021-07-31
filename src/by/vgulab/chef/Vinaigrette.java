package by.vgulab.chef;

import by.vgulab.food.*;

public class Vinaigrette extends Salad {


    public Vinaigrette() {
        setName("Винегрет");

        addIngredient(new Pepper(500.0));
        addIngredient(new Carrot(150));
        addIngredient(new Beet(250));
        addIngredient(new Eggplant());
        addIngredient(new Broccoli(45.0));
    }


}
