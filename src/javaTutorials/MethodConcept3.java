package javaTutorials;

public class MethodConcept3 {
	public static void main(String[] args) {
		MethodConcept3 meth3 = new MethodConcept3();
		int number ;	
		number= meth3.addtion(10, 20);
		String concate = meth3.concate("Bug", "Report");
		System.out.println("The addition is:" +number);
		System.out.println("THe  concated word is :" +concate);
	}
	public String concate (String s,String t)
	{
		String word = s+t;
		return 	word;
	}
	public int addtion (int a, int b) {
		int c;
		c=a+b;
		
		return c;
		
		}
		
}
