package Task;
interface RemoteControl{
	abstract void turnOn();
	default void batteryStatus() {
		System.out.println("Battery is 60% charged.");
		
	}
}
 class TV implements RemoteControl{
	 
	 public void turnOn() {
		 System.out.println("TV is On");
	 } 
	 
 }

public class Task2_1 {
	public static void main(String[] args) {
		TV obj = new TV();
		obj.turnOn();
		obj.batteryStatus();
	}

}
