package PizzaShop;
import java.util.ArrayList;
import java.util.List;

enum Size {
    SMALL, MEDIUM, LARGE
}

class Pizza {
    private final Size size;
    private final List<String> toppings;
    private final String chain;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.toppings = builder.toppings;
        this.chain = builder.chain;
    }

    public void eat() {
        System.out.println(chain + " Pizza: " + size + " with toppings " + toppings);
    }

    public static class Builder {
        private final Size size;
        private final String chain;
        private List<String> toppings = new ArrayList<>();

        public Builder(Size size, String chain) {
            this.size = size;
            this.chain = chain;
        }

        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}