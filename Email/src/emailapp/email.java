package emailapp;
import java.util.Scanner;
import java.util.Random;
public class email {
	private String firstname;  //private is used here to encapsulate
	private String lastname;   //These variables can be accessed using class API's later
	private String password;
	private String email;
	private int passwordlength=10;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	
	//constructors
	public email(String firstname,String lastname)
	{
		this.firstname=firstname;  //this is used to point to the current variable
		this.lastname=lastname;
		
		//call a method to ask the department
		this.department=setdepartment();
		System.out.println("Department: "+this.department);
		
		//call a method to return a random password
		this.password=ranpassgen(passwordlength);
		System.out.println("Your password:"+this.password);
		
		//generate an email with syntax:firstname.lastname@department.company.com
		System.out.println("Enter your company name:");
		Scanner in=new Scanner(System.in);
		String company=in.next();
		String email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+company+".com";
	}
	//method to ask department
	private String setdepartment()
	{
		System.out.println("Enter the department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1)
			return "SALES";
		else if(depChoice==2)
			return "DEVELOPMENT";
		else if(depChoice==3)
			return "ACCOUNTING";
		else
			return "";
	}
	private String ranpassgen(int length) //method to generate random password
	{
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random() * passwordset.length());//generate a random number within the scope of
			password[i]=passwordset.charAt(rand);  //the given password length and pass it to the array one at a time
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity)  //method to set the mailbox capacity
	{
		this.mailboxCapacity=capacity;
	}
	
	public void setaltemail(String altemail)//alternate email
	{
		this.alternateEmail=altemail; //this is not necessary b'coz there is no ambiguity between the class and local variables
	}
	public void changepassword(String password)//method to change the password
	{
		this.password=password;
	}
	public int getmailboxcapacity()
	{
		return mailboxCapacity;
	}
	public String getaltemail()
	{
		return alternateEmail;
	}
	public String getpassword()
	{
		return password;
	}
	public String showinfo()
	{
		return "NAME: "+firstname+" "+lastname+
				"\nCOMPANY EMAIL: "+ email +
				"\nMAILBOX CAPACITY:"+mailboxCapacity+"MB";
	}
}
