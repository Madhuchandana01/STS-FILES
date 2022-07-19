import java.util.Scanner;

class Customer {
	String custName ;
	long accNo ;
	float custBal ;
	
	void setCustomer(String a,long b, float c) {
	    custName = a ;
		accNo = b ;
		custBal = c;
	}
	
	void getCustomer() {
		System.out.println("===Enter Details===");
		System.out.println("custName   :" +custName);
		System.out.println("AccNo      :" +accNo);
		System.out.println("AccBalance : "+custBal);
	}
	
}
    class SubClass2 {	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Customer Name : ");
		String custName = s.nextLine();
		System.out.println("Enter Account Number : ");
		long accNo = s.nextLong();
		System.out.println("Enter Customer Balance :");
		float custBal = s.nextFloat();
		
		Customer sb = new Customer();
		
		sb.setCustomer(custName ,  accNo , custBal);
		sb.getCustomer() ;
		
		
}
}