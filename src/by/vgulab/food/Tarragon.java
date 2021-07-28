package by.vgulab.food;

public class Tarragon extends Spicy{
    public Tarragon() {
        super("Эстрагон", 4.0);
    }

    public Tarragon(double weight) {
        super("Эстрагон", 4.0);
    }

    public Tarragon(double calorieContent, double weight) {
        super("Эстрагон", calorieContent, weight);
    }
}
