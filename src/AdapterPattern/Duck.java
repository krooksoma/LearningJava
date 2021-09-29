package AdapterPattern;

public interface Duck {
    public void quack();
    public void fly();
}

/*		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);*/