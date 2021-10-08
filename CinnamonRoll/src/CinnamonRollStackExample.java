import java.util.LinkedList;

public class CinnamonRollStackExample {

	public static void main(String[] args) {	

		LinkedList<String> names = new LinkedList<String>();
		names.push("Smarties");
		names.push("Malteasers");
		names.push("Time-out");
		
		System.out.println(names.pop());
		System.out.println(names.remove());
		System.out.println(names.removeFirst());
	}

}
