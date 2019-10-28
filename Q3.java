import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		System.out.println("Input a number to get the sum of all even until the variable");
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int n = 0;
		for(int i = 1; i <= N; i++) {
			if(i % 2 == 0) {
				n = n + i;
				System.out.println(n);
			}
		}

	}

}
