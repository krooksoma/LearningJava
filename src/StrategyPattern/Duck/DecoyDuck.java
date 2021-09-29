package StrategyPattern.Duck;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
    }

    public void display(){
        System.out.println("Im a duck decoy");
    }
}
