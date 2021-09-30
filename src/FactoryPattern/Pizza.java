package FactoryPattern;

import java.util.ArrayList;

public class Pizza {
    String name, dough, sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding Sauce...");
        System.out.println("Adding toppings: ");
        for(String topping: toppings){
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cut into slices");
    }

    void box(){
        System.out.println("Place pizza in a box");
    }

    public String getName(){
        return name;
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---" + name + "---");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for(String topping : toppings){
            display.append(topping + "\n");
        }

        return display.toString();
    }

}
