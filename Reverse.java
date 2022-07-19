import java.util.Scanner;
class DemoLoop1 //MainClass
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
int n = s.nextInt();
int temp=n;
int rev=0;
while(n>0)
{
int k = n%10;
rev = (rev*10)+k;
n = n/10;
}//end of loop
System.out.println("The reveres of"+temp+" is "+rev);
}
}