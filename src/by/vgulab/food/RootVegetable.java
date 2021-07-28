package by.vgulab.food;

public abstract class RootVegetable extends Vegetable {
    public RootVegetable(String name, double calorieContent) {
        super(name, calorieContent);
    }

    public RootVegetable(String name, double calorieContent, double weight) {
        super(name, calorieContent, weight);
    }
}
