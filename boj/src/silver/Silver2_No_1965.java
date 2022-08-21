package silver;

import java.util.Scanner;

public class Silver2_No_1965 {

	static Integer[] dp;
	static int[] box;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		dp = new Integer[N];
		box = new int[N];

		for (int i = 0; i < N; i++) {
			box[i] = sc.nextInt();
		}

		dp[0] = 1;
		for (int i = 0; i < N; i++) {
			maxBoxes(i);
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}

		System.out.println(max);

	}

	static int maxBoxes(int idx) {

		if (dp[idx] == null) {
			dp[idx] = 1;
			int temp = 0;
			for (int i = 0; i < idx; i++) {
				if (box[i] < box[idx]) {
					if (temp < dp[i]) {
						temp = dp[i];
						dp[idx] = dp[i] + 1;
					}
				}
			}
		}
		return dp[idx];
	}

}
