import java.util.Scanner;

public class Average {

	float average(int x,int y) {
	 float avg = (float)(x+y)/2 ;
	return avg ;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in) ;
		System.out.println("Enter the value a = ");
		int a = s.nextInt();
		System.out.println("Enter the value b = ");
        int b = s.nextInt();
         
        Average ob = new Average();
        float avg = ob.average(a, b) ;
        
        System.out.println("Average  = "+avg);
        
        
	}

}
