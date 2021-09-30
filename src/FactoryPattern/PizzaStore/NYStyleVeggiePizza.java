package FactoryPattern.PizzaStore;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Regianno");
        toppings.add("Spinach");
        toppings.add("Kale");
        toppings.add("Bell Peppers");
    }
}
