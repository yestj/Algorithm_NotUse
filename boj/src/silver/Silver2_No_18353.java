package silver;

import java.util.Scanner;

public class Silver2_No_18353 {

	static Integer[] dp;
	static int[] soldier;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		dp = new Integer[N];
		soldier = new int[N];

		for (int i = 0; i < N; i++) {
			soldier[i] = sc.nextInt();
		}

		dp[0] = 1;
		for (int i = 1; i < N; i++) {
			maxSoldier(i);
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, dp[i]);
		}

		System.out.println(N - max);

	}

	static int maxSoldier(int idx) {
		if (dp[idx] == null) {
			int temp = 0;
			dp[idx] = 1;
			for (int i = 0; i < idx; i++) {
				if (soldier[idx] < soldier[i]) {
					if (dp[i] > temp) {
						temp = dp[i];
						dp[idx] = dp[i] + 1;
					}
				}
			}
		}
		return dp[idx];
	}

}
