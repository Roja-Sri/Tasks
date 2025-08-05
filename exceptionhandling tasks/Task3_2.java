package Task;
class Vehicle{
	final void engineType() {
		System.out.println("Engine Type: Petrol");
	}

}

class Car extends Vehicle{
	@Override
	final void engineType() {
		System.out.println("Engine Type: Petrol");
	}
	
}

public class Task3_2 {

}

//Error:Cannot override the final method from Vehicle
