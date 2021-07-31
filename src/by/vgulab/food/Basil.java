package by.vgulab.food;

public class Basil extends Spicy {

    public Basil() {
        super("Базилик", 5.0);
    }

    public Basil(double weight) {
        super("Базилик", 5.0);
    }

    public Basil(String name, double calorieContent, double weight) {
        super("Базилик", calorieContent, weight);
    }
}
