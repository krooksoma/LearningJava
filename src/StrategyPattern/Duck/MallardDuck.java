package StrategyPattern.Duck;

public class MallardDuck extends Duck {
    public MallardDuck(){
     quackBehavior = new Quack();
     flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {

    }
}
