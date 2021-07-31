package by.vgulab.food;

public class Pepper extends Nightshade {
    public Pepper() {
        super("Болгарский перец", 20.0);
    }

    public Pepper(double weight) {
        super("Болгарский перец", 20.0);
    }

    public Pepper(String name, double calorieContent, double weight) {
        super("Болгарский перец", calorieContent, weight);
    }
}
