package silver;

import java.util.Scanner;

public class Silver3_No_2579 {
	static Integer[] dp;
	static int[] score;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 계단 개수 입력 받기.
		int N = sc.nextInt();

		// 시작점을 index 0, 값 0 으로 저장할 수 있도록 dp와 score 배열 생성.
		dp = new Integer[N + 1];
		score = new int[N + 1];

		// 계단의 점수 입력 받기.
		for (int i = 1; i <= N; i++) {
			score[i] = sc.nextInt();
		}

		// dp 기본값 입력하기.
		dp[0] = 0;
		dp[1] = score[1];

		if (N >= 2) {
			dp[2] = score[1] + score[2];
		}

		System.out.println(maxScore(N));

	}

	// 계단 N으로 갈 수 있는 경우의 수는 2가지.
	// 1. 전전전 계단을 밟고 전계단 밟기. 
	// 2. 전전 계단 밟고 오기.
	static int maxScore(int N) {

		if (dp[N] == null)
			dp[N] = Math.max(maxScore(N-2), maxScore(N-3) + score[N - 1]) + score[N];
		return dp[N];
	}

}
