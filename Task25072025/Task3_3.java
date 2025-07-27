package Task;
final class Constants{
	public static final double PI = 3.14;

    public void display() {
        System.out.println("This is a final class with constant values.");
    }
	

} 

public class Task3_3 {
	public static void main(String[] args) {
		Constants obj = new Constants();
		obj.display();		
		
	}

}
