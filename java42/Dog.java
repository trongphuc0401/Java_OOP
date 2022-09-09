package java42;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("Toi an xuonng!");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("gau gau");
	}
	
}
