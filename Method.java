
public class Method {
	public static void main(String[] args) {
		
	}
	public static int productThree(int a, int b, int c) {
		return a * b *c;	
	}
	public static int  sumTwo(int n, int m) {
		int sumOf = 0;
		for(int i = n + 1;i <= m;i++)
			sumOf = i +n;
		return sumOf;
	}
	public static int numberthree(int a) {
		int theSum = 0;
		int average;
		for(int i = 1; i <= a; i++) {
			theSum+= i;
		}
		average = theSum/a;
		return average;
				
	}
	
	}

	


