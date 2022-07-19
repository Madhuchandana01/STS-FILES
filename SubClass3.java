import java.util.Scanner;

class BookDetails {
	String bName , bAuthor ;
	int bCode , bPrice , bQty ;
	
	void setBookDetails(String a , String b, int c ,int d , int e ) {
		bName = a;
		bAuthor = b;
		bCode= c;
		bPrice = d;
		bQty = e ;
	
	}
	
	void getBookDetails() {
		System.out.println("===BooK Details===");
		System.out.println("bName ="+bName);
		System.out.println("bAuthor = "+bAuthor);
		System.out.println("bCode = "+bCode);
		System.out.println("bPrice = "+bPrice);
		System.out.println("bQty ="+bQty);
		
	}	
}

public class SubClass3 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Name : ");
		String bName = s.nextLine();
		System.out.println("Enter Book Author : ");
		String bAuthor = s.next();
		System.out.println("Enter Book Code :");
		int bCode = s.nextInt();
		System.out.println("Enter Book Price :");
		int bPrice = s.nextInt();
		System.out.println("Enter Book Quantity : ");
		int bQty = s.nextInt();
		
		BookDetails bd =  new BookDetails();
		
		bd.setBookDetails(bName, bAuthor, bPrice, bCode, bPrice);
		bd.getBookDetails();
	}

}
