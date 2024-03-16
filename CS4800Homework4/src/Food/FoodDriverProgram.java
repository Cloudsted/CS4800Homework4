package Food;

public class FoodDriverProgram {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Alice", "No Restriction"),
            new Customer("Bob", "Paleo"),
            new Customer("Charlie", "Vegan"),
            new Customer("Diana", "Nut Allergy"),
            new Customer("Evan", "Paleo"),
            new Customer("Fiona", "Vegan")
        };

        MacronutrientFactoryProducer producer = MacronutrientFactoryProducer.getInstance();
        for (Customer customer : customers) {
            MacronutrientFactory carbsFactory = producer.getFactory("Carbs");
            MacronutrientFactory proteinFactory = producer.getFactory("Protein");
            MacronutrientFactory fatsFactory = producer.getFactory("Fats");

            String carb = carbsFactory.produceFood(customer.dietPlan);
            String protein = proteinFactory.produceFood(customer.dietPlan);
            String fat = fatsFactory.produceFood(customer.dietPlan);

            Meal meal = new Meal(carb, protein, fat);
            System.out.println(customer.name + "'s meal: " + meal);
        }
    }
}
