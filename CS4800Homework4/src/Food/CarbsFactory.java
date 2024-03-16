package Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarbsFactory implements MacronutrientFactory {
    private static CarbsFactory instance;

    private CarbsFactory() {}

    public static synchronized CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    @Override
    public String produceFood(String dietPlan) {
        List<String> foods = new ArrayList<>(Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio"));
        switch (dietPlan) {
            case "Paleo":
                return "Pistachio";
            case "Vegan":
            case "No Restriction":
                foods.remove("Cheese");
                break;
            case "Nut Allergy":
                foods.remove("Pistachio");
                break;
        }
        return foods.get(new Random().nextInt(foods.size()));
    }
}