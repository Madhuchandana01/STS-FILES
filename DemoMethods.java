
public class DemoMethods {
	static int a=10 ;
	int b=20;
	static void m1()
	{
		System.out.println("==Display from static method m1()==");
		System.out.println("The value of a ="+a);
	}
	void m2()
	{
		System.out.println("==Display from instance method m2()==");
		System.out.println("The value of a ="+a);
		System.out.println("The value of b ="+b);
	}

	public static void main(String[] args) {
		{
		    DemoMethods.m1();
			DemoMethods ob = new DemoMethods();
		    ob.m2();
		}
		
	}

}
