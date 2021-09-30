package FactoryPattern.PizzaStore;

public class NYStyleClamPizza extends Pizza{

    public NYStyleClamPizza(){
        name = "NY clam pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Regiano");
        toppings.add("Fresh Long Island Clam");
    }
}
