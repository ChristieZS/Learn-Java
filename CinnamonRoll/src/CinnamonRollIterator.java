import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CinnamonRollIterator {

	public static void main(String[] args) {	

		LinkedList<String> names = new LinkedList<String>();
		names.push("Smarties");
		names.push("Malteasers");
		names.push("Time-out");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Galaxy");
		
	
		
		
		for(String s: names) {
			System.out.println(s);	
		}
		
	}

}
