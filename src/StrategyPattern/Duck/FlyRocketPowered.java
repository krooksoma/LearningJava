package StrategyPattern.Duck;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly with Rockets");
    }
}
