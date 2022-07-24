package conditionalStatement;

public class For_LoopSimple_Increment {
//Simple Loop statement by using increment
	
	public static void main(String[] args) {
		int count= 0;
			for(int i=0; i<=50;i++) 
			{ 
				if(((i%2)==1) ) {
				System.out.println(i+" ");
				count++;
			}
		}
			System.out.println("number of even numbers "+count);
	}

}
