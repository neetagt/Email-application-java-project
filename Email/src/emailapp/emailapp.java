package emailapp;
import java.util.Scanner;
public class emailapp {

	public static void main(String[] args) {
		System.out.println("Enter your firstname:");
		Scanner in=new Scanner(System.in);
		String firstname=in.next();
		System.out.println("Enter your lastname:");
		String lastname=in.next();
		email em1 = new email(firstname, lastname);
		System.out.println("Do you want to change the email?\nIf yes choose 1\nIf no choose any other number");
		int choice=in.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the email:");
			String altemail=in.next();
			em1.setaltemail(altemail);
			System.out.println("Your email is successfully changed to "+em1.getaltemail());
		}
		System.out.println(em1.showinfo());
			
	}

}
