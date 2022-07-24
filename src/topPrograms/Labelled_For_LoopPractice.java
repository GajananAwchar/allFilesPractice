package conditionalStatement;

public class Labelled_For_LoopPractice {

	public static void main(String[] args) {
		int i,j;
		outer:
			for (i=1; i<=3; i++) {
					for (j=1; j<=3; j++) {
						if (i==2 && j==2) {
							break outer;
						}
						System.out.println(i + " " +j);
					}
			}
	}

}
