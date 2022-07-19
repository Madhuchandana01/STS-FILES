import java.util.Scanner;
	class StudentData1 {
		 String name , course , trainer , date , mailId ;
    long phNo ;
	void setStudentData(String a , String b ,String c , String d,String e ,long f) 
	{
		name = a ;
		course = b ;
		trainer = c ;
		date = d ;
		mailId = e;
		phNo = f ;	
	}
	void getStudentData () {
		System.out.println("===StudentData===");
		System.out.println("Name: "+name);
		System.out.println("Course : "+course);
		System.out.println("trainer : "+trainer);
		System.out.println("date :"+date);
		System.out.println("===StudentContact===");
		System.out.println("MailId :"+mailId);
		System.out.println("PhoneNo : "+phNo );
	}		
}	

	class SubClass1 {//Main class
	
		public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);	
		System.out.println("Enter the Student Name : ");
		String stuName = s.nextLine();
		System.out.println("Enter the Course Name : ");
		String cName = s.nextLine();
		System.out.println("Enter the Trainer Name : ");
		String tName = s.nextLine();
		System.out.println("Enter the date : ");
		String date = s.nextLine();
		System.out.println("Enter the MailId : ");
		String mailId = s.nextLine();
		System.out.println("Enter the PhoneNo : ");
		long phNo = s.nextLong();
		
		
		StudentData1 sd = new StudentData1 ();
	    sd.setStudentData(stuName, cName, tName, date,mailId , phNo );
		sd.getStudentData();
		
	}
}