import java.util.Scanner;

public class CinnamonRoll {


	public static void main(String[] args) {	

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Marshmallow")) {
			System.out.println("Nom Nom Marshmallow");
		}
		else {
			System.out.println("Who you?");
		}
		
		in.close();
	}

}
