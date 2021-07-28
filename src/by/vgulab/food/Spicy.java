package by.vgulab.food;

public abstract class Spicy extends Vegetable {
    public Spicy(String name, double calorieContent) {
        super(name, calorieContent);
    }

    public Spicy(String name, double calorieContent, double weight) {
        super(name, calorieContent, weight);
    }
}
