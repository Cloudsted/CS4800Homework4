package Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatsFactory implements MacronutrientFactory {
    private static FatsFactory instance;

    private FatsFactory() {}

    public static synchronized FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    @Override
    public String produceFood(String dietPlan) {
        List<String> foods = new ArrayList<>(Arrays.asList("Avocado", "Sour cream", "Tuna", "Peanuts"));
        switch (dietPlan) {
            case "Paleo":
                foods.remove("Sour cream");
                break;
            case "Vegan":
                foods.remove("Sour cream");
                foods.remove("Tuna");
                break;
            case "Nut Allergy":
                foods.remove("Peanuts");
                break;
            case "No Restriction":
                break;
        }
        return foods.get(new Random().nextInt(foods.size()));
    }
}