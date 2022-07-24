package conditionalStatement;

public class Labelled_For_Loop {

	public static void main(String[] args) {
		aa:
			for(int i=1; i<=5;i++) {
			for (int j=1; j<=5; j++)	{
				if (i==2 && j==2 ) {
					break aa;
				}
				System.out.println(i + " & " +j);
		
				
			}
			}
	}

}
