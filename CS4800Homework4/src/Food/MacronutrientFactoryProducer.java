package Food;

public class MacronutrientFactoryProducer {
    private static MacronutrientFactoryProducer instance;

    private MacronutrientFactoryProducer() {}

    public static synchronized MacronutrientFactoryProducer getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactoryProducer();
        }
        return instance;
    }

    public MacronutrientFactory getFactory(String type) {
        switch (type) {
            case "Carbs":
                return CarbsFactory.getInstance();
            case "Protein":
                return ProteinFactory.getInstance();
            case "Fats":
                return FatsFactory.getInstance();
            default:
                return null;
        }
    }
}