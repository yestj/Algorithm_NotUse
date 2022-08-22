package bronze;

import java.util.Scanner;

public class Bronze1_No_9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			String input = sc.nextLine();
			String[] arr = input.split(" ");
			
			StringBuilder result = new StringBuilder();
			
			for(String x : arr) {
				StringBuffer sb = new StringBuffer(x);
				result.append(sb.reverse() + " ");
			}
			System.out.println(result.toString());
		}

	}

}
