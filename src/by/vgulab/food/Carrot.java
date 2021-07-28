package by.vgulab.food;

public class Carrot extends RootVegetable {
    public Carrot() {
        super("Морковь", 36.0);
    }

    public Carrot(double weight) {
        super("Морковь", 36.0, weight);
    }

    public Carrot(double calorieContent, double weight) {
        super("Морковь", calorieContent, weight);
    }
}
