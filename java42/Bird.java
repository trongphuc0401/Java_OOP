package java42;

public class Bird extends Animal {

	public Bird() {
		super("Bird");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("toi an");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
		System.out.println("chip chip");
	}
	
}
