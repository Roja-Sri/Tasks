package tasks;

abstract class Appliance{
	 abstract void turnOn();
}
interface Connectable {
	 void connect();
		
}
class SmartTv extends Appliance implements Connectable{
	void turnOn() {
		System.out.println("Turning On the smartTV. Please wait....");
	}
	public void connect() {
		System.out.println("Connecting SmartTV to WiFi...");
	}
	
	
}

public class Task8 {
	public static void main(String[] args) {
		SmartTv tv = new SmartTv();
			tv.turnOn();
			tv.connect();
		
		
	}

}
