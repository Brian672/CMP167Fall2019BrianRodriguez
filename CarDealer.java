import java.util.Scanner;
public class CarDealer {

	public static void main(String[] args) {
		int crediScore, age;
		Scanner input = new Scanner (System.in);
		String answer;
				
		System.out.println("Hey i'm a car dealer, \nwould you like to buy car?");
		answer = input.next();
		if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("Whatchu buyinn?");
		age = input.nextInt();
		if(age>=25) {
			System.out.println("Ok, Good");
		}else {
			System.out.println("You gotta leave");
		}
		}else {
			System.out.println("Have fun lookin.");
		}
		

	}

}
