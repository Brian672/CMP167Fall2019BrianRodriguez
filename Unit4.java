import java.util.Scanner;
public class Unit4 {
public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	
	int age;
	String name;
	
	System.out.print("What is your name; ");
	name = in.nextLine();
	System.out.printf("alright %s");
	age = in.nextInt();
	
	if (age<=18) {
		System.out.println("Was good blood");
	}
	else if (age>18) {
		System.out.println("Was poppin");
	}
	else
		System.out.println("ok");
}
}
