package collectionstasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Task2_1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("C");
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}
