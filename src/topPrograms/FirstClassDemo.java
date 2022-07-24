package classDemo;

public class FirstClassDemo 
{
int x=90;
int y=100;

	public static void main(String[] args)
	{	
		System.out.println("Program is Started");
		FirstClassDemo obj1=new  FirstClassDemo();
		obj1.sum();
		System.out.println("x value is" +obj1.x);
		System.out.println("y value is " +obj1.y);
System.out.println("Enfd of Program");		
FirstClassDemo obj2=new  FirstClassDemo();
obj2.sum();
System.out.println("x value is" +obj2.x);
System.out.println("y value is " +obj2.y);
int sum= sum1(10, 20, 10);
System.out.println(sum);
}
	public void sum()
	{
		int a=90;
		int b=100;
		int c=b+a;
		System.out.println("sum of two numbers is" +c);
		
		
	}
	public static int sum1(int a, int b, int c)
	{
		c=b+a;
		//System.out.println("sum of two numbers is" +c);
		return c;
		
		
	}
}
