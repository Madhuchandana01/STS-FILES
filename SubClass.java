import java.util.Scanner;
	class StudentData {
    String name , course , trainer , date ;
	void setStudentData(String a , String b ,String c , String d) 
	{
		name = a ;
		course = b ;
		trainer = c ;
		date = d ;
	}
	
	void getStudentData () {

		System.out.println("===StudentData===");
		System.out.println("Name: "+name);
		System.out.println("Course : "+course);
		System.out.println("trainer : "+trainer);
		System.out.println("date :"+date);

}
	
	class StudentContact { //subclass2 {
      String mailId ;
      long phNo ;
      void setStudentContact (String a ,long b) {
		mailId = a ;
		phNo = b ;
      }
		
		void getStudentContact () {
			System.out.println("===StudentContact===");
			System.out.println("MailId :"+mailId);
			System.out.println("PhoneNo : "+phNo );
		}
	}		
		
	class SubClass {//Main class
	
		public void main(String[] args) {
		
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
		
		StudentData sd = new StudentData ();
		StudentContact sc = new StudentContact ();
		
	    sd.setStudentData(stuName, cName, tName, date);
		sc.setStudentContact(mailId,phNo);
		
		sd.getStudentData();
		sc.getStudentContact();
}
	}
	
	}