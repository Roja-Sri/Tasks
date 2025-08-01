package collectionstasks;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2_2 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(20);
		ts.add(10);
		ts.add(61);
		ts.add(12);
		ts.add(22);
		//System.out.println(ts);
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		
	}

}
