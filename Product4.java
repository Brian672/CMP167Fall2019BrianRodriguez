import java.util.Scanner;
public class Product4 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 4 Numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int result = (num1 * num2 * num3 * num4);
		System.out.println(result);
	}
}
