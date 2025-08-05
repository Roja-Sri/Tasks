package Task;
abstract class Shape{
	double pi=3.14;
	abstract double area();
	
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


public class Task1_1 {
	public static void main(String[] args) {
		Shape circle = new Circle(8);
        Shape rectangle = new Rectangle(6, 4);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
		
	}

}
