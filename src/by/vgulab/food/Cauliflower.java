package by.vgulab.food;

public class Cauliflower extends Cabbage {
    public Cauliflower() {
        super("Цветная капуста", 28.0);
    }


    public Cauliflower(double weight) {
        super("Цветная капуста", 28.0);
    }

    public Cauliflower(String name, double calorieContent, double weight) {
        super("Цветная капуста", calorieContent, weight);
    }
}
