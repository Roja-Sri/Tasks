package tasks;
class Vehicle{
	
	String brand;
	float speed;
}

class Car extends Vehicle{
	
	void showDetails() {
		System.out.println("Details are : ");
		System.out.println("Brand Name : ");
		System.out.println("Speed : ");
		
	}
}

class Bike extends Vehicle {
	
    void showDetails() {
		System.out.println("Details are : ");
		System.out.println("Brand Name : "+brand);
		System.out.println("Speed : "+speed);
		
	}
	
}

public class Task5 {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.brand = "BMW";
		b.speed = 250;
		b.showDetails();
		
	}

}
