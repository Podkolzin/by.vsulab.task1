package by.vgulab.food;

public class Beet extends RootVegetable {
    public Beet() {
        super("Свекла", 47.0);
    }

    public Beet(double weight) {
        super("Свекла", 47.0, weight);
    }

    public Beet(double calorieContent, double weight) {
        super("Свекла", calorieContent, weight);
    }
}
