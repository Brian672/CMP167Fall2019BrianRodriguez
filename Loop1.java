import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Input 2 values");
		num1 = input.nextInt();
		num2 = input.nextInt();
		int result = (num1 + num2);
		System.out.println(result);
		
		System.out.println("Input a number for the variable N");
		int N = input.nextInt();
		int SN;
		for (int i = 1; i < N + 1; i++) {
			SN = i * i;
			System.out.printf("The square of %d is %d\n",i,SN);
		}
		for(int i = 1; i < 101; i++) {
			while (i % 2 != 0) {
				continue;
			}
		}
				

	}
}