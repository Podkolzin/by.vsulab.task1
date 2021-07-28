package by.vgulab.food;

public abstract class Cabbage extends Vegetable {
    public Cabbage(String name, double calorieContent) {
        super(name, calorieContent);
    }

    public Cabbage(String name, double calorieContent, double weight) {
        super(name, calorieContent, weight);
    }
}
