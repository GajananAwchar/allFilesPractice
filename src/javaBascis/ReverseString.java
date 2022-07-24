package javaBascis;

public class ReverseString {

			public static void main(String[] args) {
				String str= "ABCD";
				String reverse = "";
				int length =str.length();
				for(int i=length-1; i>=0; i--)
				{
					reverse= reverse+str.charAt(i);	
				}
				System.out.println("reversed String  is: " + reverse);
				//*/
				
				
				/*char a[] =str.toCharArray();
				int len = a.length;
				for (int i = len-1;i>=0; i--) {
					reverse = reverse+a[i];
					
				}
				System.out.println("reversed String  is: " + reverse);*/
				//StringBuffer sb = new StringBuffer(str);
				//System.out.println("the reverse string is: " +sb.reverse());
				
			}
}
