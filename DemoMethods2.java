import java.util.Scanner;

public class DemoMethods2 {

	float calculate(int totMarks) {
	float per = (float)totMarks/6 ;
	return per ;
	
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		System.out.println("s1 = ");
		int s1 = s.nextInt();
		System.out.println("s2 = ");
		int s2 = s.nextInt();
		System.out.println("s3 = ");
		int s3 = s.nextInt();
		System.out.println("s4 = ");
		int s4 = s.nextInt();
		System.out.println("s5 = ");
		int s5 = s.nextInt();
		System.out.println("s6 = ");
		int s6 = s.nextInt();
		
		int totMarks = s1+s2+s3+s4+s5+s6 ;
		
		System.out.println("total marks = "+totMarks);
		
		DemoMethods2 ob = new DemoMethods2();
		float per = ob.calculate(totMarks) ;
		
		System.out.println("Perentage = "+per);
		
		
		
		

	}

	}
