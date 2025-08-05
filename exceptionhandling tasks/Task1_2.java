
abstract class Shape{
	abstract double area(); 

    void displayShapeType() { 
        System.out.println("This is a shape.");
    }
	
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}


public class Task1_2 {
	 public static void main(String[] args) {
	        Shape s1 = new Circle(8);
	        Shape s2 = new Rectangle(6,4);

	        s1.displayShapeType();
	        System.out.println("Circle Area: " + s1.area()); 

	        s2.displayShapeType();
	        System.out.println("Rectangle Area: " + s2.area()); 
	    }

}


