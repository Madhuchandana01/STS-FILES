
public class Result {
	float percentage (int x, int y) {
		float result = (float)(x+y)/100 ;
		return result ;
	}
	public static void main(String[] args) {
		int s1=70 , s2=88 ;
		Result ob = new Result ();
		float c=ob.percentage(s1,s2);
		System.out.println("Percentage of total marks ="+c);

	}
	public float calculate(int totM) {
		// TODO Auto-generated method stub
		return 0;
	}
	}