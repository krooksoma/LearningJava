package StrategyPattern.Duck;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("StrategyPattern.Duck.Quack");
    }
}
