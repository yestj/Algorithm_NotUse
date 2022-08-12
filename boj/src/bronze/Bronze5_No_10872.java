package bronze;

import java.util.Scanner;

public class Bronze5_No_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(factorial(N));
		
	}
	
	// 재귀함수 사용.
	public static int factorial(int num) {
		if(num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
