import java.util.Scanner;

public class DemoMethods3 {

float calculate (int bSal) {
	
		float totSal= bSal + (0.93F*bSal) + (0.63f * bSal) ;
	return totSal ;
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		DemoMethods3 ob = new DemoMethods3 ();
				
		System.out.println("Enter the bSal = ");
		int bSal = s.nextInt();
		float totSal = ob.calculate(bSal) ; 
		
		System.out.println("BSal = "+bSal);
		System.out.println("HRA = "+0.93*bSal);
		System.out.println("PF = "+0.63*bSal);
		System.out.println("TotSal = "+totSal );
		
		

	}

}
