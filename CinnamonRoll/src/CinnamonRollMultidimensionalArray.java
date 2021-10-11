public class CinnamonRollMultidimensionalArray {

	public static void main(String[] args) {	
		int [] [] magic = {
				{4, 6, 3, 10},
				{4, 2, 40, 1},
				{5, 34, 1, 43}
		};
		
		for(int i=0; i < magic.length; i++) {
			for(int j=0; j < magic[i].length; j++){
				System.out.print(magic[i][j]);
			}
			System.out.println();
		}
	}
}
