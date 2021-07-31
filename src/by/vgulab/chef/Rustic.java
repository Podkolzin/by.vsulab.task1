package by.vgulab.chef;

import by.vgulab.food.*;

public class Rustic extends Salad {
    public Rustic() {
        setName("Деревенский");

        addIngredient(new WhiteСabbage(450));
        addIngredient(new Tarragon(26.8));
        addIngredient(new Parsley(89));
        addIngredient(new Carrot(102));
        addIngredient(new Broccoli(267));
        addIngredient(new Beet(170));
    }
}
