package StrategyPattern.Duck;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly using my wings");
    }
}
