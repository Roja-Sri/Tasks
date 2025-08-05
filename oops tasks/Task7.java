package tasks;

class Animal{
	void sound() {
		System.out.println("Animal Sounds");
	}
}

class Dog extends Animal{
	
void sound() {
		System.out.println("Dog sound : bark");
	}
}
	
class Cat extends Animal{
	
void sound() {
		System.out.println("Cat sound : meow");
	}
	
}
class Cow extends Animal{
	
void sound() {
	System.out.println("Cow sound : moo");
		
	}
}

public class Task7 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
	}

}
