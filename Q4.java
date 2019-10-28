import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name?");
		String username = scnr.nextLine();
		System.out.println("What is your pet's name?");
		String petname = scnr.nextLine();
		int petnameL = petname.length();
		System.out.println(petnameL);
	
		
	}

}
