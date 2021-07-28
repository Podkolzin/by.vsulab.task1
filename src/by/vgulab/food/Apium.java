package by.vgulab.food;

public class Apium extends RootVegetable {
    public Apium() {
        super("Сельдерей", 5.0);
    }

    public Apium(double weight) {
        super("Сельдерей", 5.0, weight);
    }

    public Apium(double calorieContent, double weight) {
        super("Сельдерей", calorieContent, weight);
    }
}
