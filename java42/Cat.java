package java42;

public class Cat extends Animal {

	public Cat() {
		super("Cat");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("Toi an");
	}

	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("meow meow");
	}

}
