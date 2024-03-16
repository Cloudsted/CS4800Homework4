package Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProteinFactory implements MacronutrientFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {}

    public static synchronized ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    public String produceFood(String dietPlan) {
        List<String> foods = new ArrayList<>(Arrays.asList("Fish", "Chicken", "Beef", "Tofu"));
        switch (dietPlan) {
            case "Paleo":
                foods.remove("Tofu");
                break;
            case "Vegan":
                return "Tofu";
            case "Nut Allergy":
            case "No Restriction":
                break;
        }
        return foods.get(new Random().nextInt(foods.size()));
    }
}