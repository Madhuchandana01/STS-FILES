
public class Result1 {
	float calculate(int totMarks)
	{
		float per = (float)totMarks/6 ;
		return per;
	}

	public static void main(String[] args) {
		{
			int s1=90,s2=89,s3=67,s4=64,s5=97,s6=63;
			int totM = s1+s2+s3+s4+s5+s6 ;
			Result1 r = new Result1();
			float percentage = r.calculate(totM) ;
			System.out.println("===DETAILS===");
			System.out.println("s1="+s1);
			System.out.println("s2="+s2);
			System.out.println("s3="+s3);
			System.out.println("s4="+s4);
			System.out.println("s5="+s5);
			System.out.println("s6="+s6);
			System.out.println("TotMarks="+totM);
			System.out.println("Percentage="+percentage);
		}

	}

}
