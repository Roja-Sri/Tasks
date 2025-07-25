package tasks;


@FunctionalInterface
interface MathOperation{
	int operator(int a, int b);
	
}

public class Task11 {
	public static void main(String[] args) {
		MathOperation add= (x,y) -> x + y;
		MathOperation subs= (x,y) -> x - y;
		MathOperation multiply= (x,y) -> x * y;
		
		System.out.println(add.operator(10, 20));
		System.out.println(subs.operator(68, 37));
		System.out.println(multiply.operator(5, 6));
		
		
	}

}
