package by.vgulab.food;

public class Parsley extends RootVegetable {
    public Parsley() {
        super("Петрушка", 9.0);
    }

    public Parsley(double weight) {
        super("Петрушка", 9.0, weight);
    }

    public Parsley(String name, double calorieContent, double weight) {
        super("Петрушка", calorieContent, weight);
    }
}