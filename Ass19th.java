import java.util.Scanner;

class Add {
	int x,y ;
	int sum = x+y ;
}

class Sub {
	int x , y;
	int Sub = x-y ;
}

class Mul {
	int x , y ;
	int Mul = x*y ;
}

class Div {
	float x , y;
	float Div = x/y ;
}

class modDiv {
	float x , y;
	float modDiv = x%y ;
}

public class Ass19th {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select any 2 Numbers : ");
		System.out.println("x = ");
		int x = s.nextInt();
		System.out.println("y = ");
		int y = s.nextInt();
		
		System.out.println("Select Any Arithmetic Operation :");
		System.out.println("1.Add , 2.Sub , 3.Mul ,4.Div , 5.modDiv ");
		System.out.println("Enter ur Choice : ");
	    int choice = s.nextInt();
		switch (choice) {
		case 1:
			Add ad = new Add ();
	    	int sum = x+y ;
			System.out.println("Add : "+sum);
			break ;
		case 2 : 
			Sub sb = new Sub ();
			int sub = x-y ;
			System.out.println("Sub : "+sub);
			break ;
			
	    case 3 :
			Mul mu = new Mul ();
			int Mul = x*y ;
			System.out.println("Mul : "+Mul);
			break ;
			
	    case 4 :
			Div dv = new Div ();
			float Div = (float) x/y ;
			System.out.println("Div : "+Div);
			break ;
			
		case 5 :
			modDiv md = new modDiv ();
			float modDiv = x%y ;
			System.out.println("Mod : "+modDiv); 
			break ;
					
			default :
				System.out.println("Wrong Input");
		}

	}

}
