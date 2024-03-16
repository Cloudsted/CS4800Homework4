package PizzaShop;
public class PizzaShop {
    public static void main(String[] args) {
        // Creating three pizzas for Pizza Hut
        Pizza pizzaHutSmall = new Pizza.Builder(Size.SMALL, "Pizza Hut")
                .addTopping("Pepperoni").addTopping("Sausage").addTopping("Bacon").build();
        Pizza pizzaHutMedium = new Pizza.Builder(Size.MEDIUM, "Pizza Hut")
                .addTopping("Mushrooms").addTopping("Onions").addTopping("Extra Cheese")
                .addTopping("Peppers").addTopping("Chicken").addTopping("Olives").build();
        Pizza pizzaHutLarge = new Pizza.Builder(Size.LARGE, "Pizza Hut")
                .addTopping("Spinach").addTopping("Tomato and Basil").addTopping("Beef")
                .addTopping("Ham").addTopping("Pesto").addTopping("Spicy Pork")
                .addTopping("Ham and Pineapple").addTopping("Olives").addTopping("Chicken").build();

        pizzaHutSmall.eat();
        pizzaHutMedium.eat();
        pizzaHutLarge.eat();

        Pizza littleCaesarsLarge = new Pizza.Builder(Size.LARGE, "Little Caesars")
                .addTopping("Pepperoni").addTopping("Sausage").addTopping("Bacon").build();
        Pizza dominosMedium = new Pizza.Builder(Size.MEDIUM, "Dominos")
                .addTopping("Mushrooms").addTopping("Onions").addTopping("Extra Cheese")
                .addTopping("Peppers").addTopping("Chicken").addTopping("Olives")
                .addTopping("Spinach").addTopping("Tomato and Basil").build();
        Pizza dominosSmall = new Pizza.Builder(Size.SMALL, "Dominos")
                .addTopping("Beef").build();

        littleCaesarsLarge.eat();
        dominosMedium.eat();
        dominosSmall.eat();
    }
}