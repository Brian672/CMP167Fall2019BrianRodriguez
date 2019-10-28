import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input a number");
		int N = scnr.nextInt();
		for (int i = N-1;i > 0;i--) {
			N = N * i;
			System.out.println(N);
		}
		
	}
}
