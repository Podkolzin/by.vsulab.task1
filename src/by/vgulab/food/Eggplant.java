package by.vgulab.food;

public class Eggplant extends Nightshade {
    public Eggplant() {
        super("Баклажан", 25.0);
    }

    public Eggplant(String name, double weight) {
        super("Баклажан", 25.0);
    }

    public Eggplant(String name, double calorieContent, double weight) {
        super("Баклажан", calorieContent, weight);
    }
}
