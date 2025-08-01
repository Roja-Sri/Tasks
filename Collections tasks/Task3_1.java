package collectionstasks;
import java.util.HashMap;
import java.util.Map;

public class Task3_1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Alex");
		hm.put(2, "Bob");
		hm.put(3, "Clare");
		hm.put(4, "Aman");
		hm.put(5, "Joan");
		
		hm.remove(3);
		
		System.out.println("Value of 1: " +hm.entrySet());
		
		for(Map.Entry<Integer, String> e: hm.entrySet()) 
			System.out.println(e.getKey()+ " " +e.getValue());
	}

}
