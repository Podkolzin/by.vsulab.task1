package by.vgulab.food;

public class Broccoli extends Cabbage {

    public Broccoli() {
        super("Брокколи", 34.0);
    }

    public Broccoli(double weight) {
        super("Брокколи", 34.0);
    }

    public Broccoli(double calorieContent, double weight) {
        super("Брокколи", calorieContent, weight);
    }
}
