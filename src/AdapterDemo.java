
public class AdapterDemo {

	public static void main(String[] args) {
		
		RegularDuck duck = new RegularDuck();
		duck.quack();
		duck.fly();
		
		RegularTurkey turkey = new RegularTurkey();
		turkey.gobble();
		turkey.fly();
		
		Duck duck2 = new TurkeyAdapter(turkey);
		duck2.quack();
		duck2.fly();

	}

}
