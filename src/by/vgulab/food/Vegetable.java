package by.vgulab.food;

public abstract class Vegetable {

    private String name;
    private double calorieContent;
    private double weight;

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, double calorieContent) {
        if (calorieContent > 0) {
            this.name = name;
            this.calorieContent = calorieContent;
            this.weight = 100;
        } else {
            throw new IllegalArgumentException("Калорийность не может быть меньше 0");
        }
    }

    public Vegetable(String name, double calorieContent, double weight) {
        if (calorieContent > 0 && weight > 0) {
            this.name = name;
            this.calorieContent = calorieContent;
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Калорийность и вес не может быть меньше 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalorieContent() {
        return calorieContent;
    }

    public double getTotalCalories() {
        return calorieContent * weight / 100.0;
    }

    public void setCalorieContent(double calorieContent) {
        this.calorieContent = calorieContent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return (weight + " в граммах " + name + " " + getTotalCalories() + " каллорий");
    }
}
