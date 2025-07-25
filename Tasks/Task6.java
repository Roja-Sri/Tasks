package tasks;


class Calculator{
	void add(int x,int y) {
		int res;
		res=x+y;
		System.out.println("sum is :"+res);
	}
	void add(double x,double y) {
		double res;
		res=x+y;
		System.out.println("sum is :"+res);
	}
	void add(String x, String y) {
		String res;
		res=x+y;
		System.out.println("sum is :"+res);
		
	}
}


public class Task6 {
		public static void main(String[] args) {
			Calculator obj = new Calculator();
			obj.add(30,20);
			obj.add(20.75, 40);
			obj.add("Hello","World");
		}
}
