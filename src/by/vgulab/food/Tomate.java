package by.vgulab.food;

public class Tomate extends Nightshade {

    public Tomate() {
        super("Томат", 18.0);
    }

    public Tomate(String name, double weight) {
        super("Томат", 18.0);
    }

    public Tomate(String name, double calorieContent, double weight) {
        super("Томат", calorieContent, weight);
    }
}
