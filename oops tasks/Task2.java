package tasks;

class Employee{
	static double count;
	Employee(){
		count++;
	}
	void display() {
		System.out.println("count of Employees :" +count);
	}
}

public class Task2 {
	public static void main(String[] args) {
		Employee obj1 = new Employee();		
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		Employee obj4 = new Employee();
		obj4.display();
		
	}

}
