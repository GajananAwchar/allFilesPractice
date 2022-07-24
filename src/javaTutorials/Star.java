package javaTutorials;

public class Star {
	public static void main(String args[]) {
		for (int i =0; i<=5; i++) {
			// i=0, j=0   * 
			// i=1, j=0, j= 1   **
			// i=2, j=0, j= 1, j= 2 ***
			// i=3 ****
			// i = 4 *****
			//i = 5 ******
			for (int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
