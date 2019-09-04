import java.util.Scanner;

/**
 *
 * @author Student
 *description:
 * created
 */
public class NameGetter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your first and last name");
		String fname = input.next();
		String lname = input.next(); 
		System.out.println("Thank you, "+fname);
		System.out.println("Oh your last name is "+lname+"!!");
		
	}
}
