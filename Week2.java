/**
 * 
 * @author Brian
 *
 **/
import java.util.Random;
public class Week2 {
	public static void main(String[] args) {
		Random randGen;
		int num;
		int num2;
		
		randGen= new Random();
		num = randGen.nextInt(15) + 1;
		num2 = 14;
		
		System.out.println("The number of the day is...");
		System.out.println(num);
		
		if (num==num2)
			System.out.println("It's a match");
		else
			System.out.println("It's Not a Match");
		
		}
	}

