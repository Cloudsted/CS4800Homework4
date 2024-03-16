package Food;

public class Meal {
    String carb;
    String protein;
    String fat;

    public Meal(String carb, String protein, String fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal{" +
               "carb='" + carb + '\'' +
               ", protein='" + protein + '\'' +
               ", fat='" + fat + '\'' +
               '}';
    }
}