package interviewQuestions;

public class AlphabetOrNot {

	public static void main(String[] args) {
		int a= 9 ;
		
		char ch='Z';
		if((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z')) {
		System.out.println(ch + " is an Alphabet");	
		}
		else {
			System.out.print(ch + "  is not an Alphabet");	
		}
		if(a>9 && a<100) {
			System.out.print(a + " is two digit num");	
			}
			else {
				System.out.println(a + " is not two digit num");	
			}
		
		
	}

}
