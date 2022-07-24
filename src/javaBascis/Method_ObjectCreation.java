package javaBascis;
 class Books{
	 String BookName;
	 int BookPrice;
	 String AuthorName;
	 int BookNumber;
	 int Quantity;
	 public void DisplayBookName(String BookName) {
		 System.out.println("The Book name is:"+BookName);
	 }
	 public void DisplayBookPrice(int BookPrice) {
		 System.out.println("The Book price is:"+BookPrice);
	 }
	 public void DisplayAuthorName(String AuthorName) {
		 System.out.println("The Book Author Name is:"+AuthorName); 
 }
	 public void DisplayBookNumber(int BookNumber) {
		 System.out.println("The Book BookNumber is:"+BookNumber); 
	 }
	 public void DisplayQuantity(int Quantity) {
		 System.out.println("The Book BookNumber is:"+Quantity); 
	 }
 }
public class Method_ObjectCreation {
	public static void main(String[] args){
		Books book1 = new Books();
	book1.DisplayBookName("Agnipankh");
	book1.DisplayAuthorName("Apj");
	book1.DisplayBookPrice(1200);
	book1.DisplayBookNumber(200);
	book1.DisplayQuantity(01);
	}
}
