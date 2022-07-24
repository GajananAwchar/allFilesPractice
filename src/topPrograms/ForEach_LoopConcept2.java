package conditionalStatement;

public class ForEach_LoopConcept2 {

	public static void main(String[] args) {
		// array 
		String[] department = {"mechanical "," civil"," IT"};
		// for each loop
		String rev="";
		for (String d:department) {
			for(int i=0;i<=d.length()-1;i--) {
				rev = rev+d.charAt(i);
			}
			System.out.println(rev);
		}
	}

}
