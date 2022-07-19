import java.util.Scanner;

class Balance //SubClass
{
double bal=2000;
void getBalance()
{
System.out.println("Balance Amt:"+bal);
}
}

class CheckPinNo //SubClass
{
boolean k=false;
boolean verify(int pinNo)
{
if(pinNo==1111 || pinNo==2222 || pinNo==3333)
{
k=true;
}
return k;
}
}

class WithDraw //SubClass
{
void wDraw(int amt,Balance b)
{
if(amt< b.bal)
{
System.out.println("Amt WithDrawn:"+amt);
b.bal=b.bal-amt;
b.getBalance();
System.out.println("Transaction Completed...");
}//end of if
else
{
System.out.println("InSufficient Fund...");
}
}
}
class Deposit //SubClass
{
void deposit(int amt,Balance b)
{
System.out.println("Amt deposited:"+amt);
b.bal=b.bal+amt;
b.getBalance();

System.out.println("Transaction completed...");
}
}

class BankMainClass //MainClass
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
Balance b = new Balance();//Object
int count=0;
pqr:
	
while(true)
{
System.out.println("Enter the pinNo:");
int pNo = s.nextInt();
CheckPinNo cpn = new CheckPinNo();//Object
boolean k = cpn.verify(pNo);//method_call
if(k)
{
System.out.println("====Choice====");
System.out.println("1.WithDraw\n2.Deposit");
System.out.println("Enter the Choice:");
int choice = s.nextInt();
switch(choice)

{
case 1:
System.out.println(";Enter the amt:");
int a1 = s.nextInt();
if(a1>0 && a1%100==0)
{

WithDraw wd = new WithDraw();//Object
wd.wDraw(a1,b);

}//end of if
else
{
System.out.println("Invalid amt...");

}
break pqr;//stop the while
case 2:
System.out.println("Enter the amt:");
int a2 = s.nextInt();
if(a2>0 && a2%100==0)
{

Deposit dp = new Deposit();//Object
dp.deposit(a2,b);//method_call

}//end of if
else
{

System.out.println("Invalid amt...");

}
break pqr;//stop the while
default:
System.out.println("Invlaid Choice..");
break pqr;//stop the while
}//end of switch
}//end of if
else
{
System.out.println("Invalid pinNo...");
count++;
}
if(count==3)
{
System.out.println
("Sorry ! Transaction blocked");
break;//stopping the while loop
}
}//end of loop
}
}
		
		
		
		
		
		
		
	