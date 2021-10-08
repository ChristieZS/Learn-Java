import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinnamonRoll {


	public static void main(String[] args) throws FileNotFoundException {	

		Scanner in = new Scanner(new File("src/pigs.txt"));

		List<String> pigs = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			pigs.add(in.nextLine());
		}
		
		for(int i = 0; i < pigs.size(); i++ ) {
			System.out.println("name: " + pigs.get(i));
		}
		
		in.close();
	}

}
