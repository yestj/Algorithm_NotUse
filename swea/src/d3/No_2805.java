package d3;

import java.util.Scanner;

public class No_2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			// 농장의 값 입력 받기.
			int[][] farm = new int[N][N];
			for (int r = 0; r < N; r++) {
				String nums = sc.next();
				for (int c = 0; c < N; c++) {
					farm[r][c] = nums.charAt(c) - '0';
				}
			}
			
			// 수확 가능한 부분만 더해서 값 출력하기.
			int sum = 0;
			for (int c = 0; c < N; c++) {
				sum += farm[N / 2][c];
			}
			for (int i = 1; i <= N / 2; i++) {
				for (int c = i; c < N - i; c++) {
					sum += farm[N / 2 - i][c];
					sum += farm[N / 2 + i][c];
				}
			}

			System.out.println("#" + tc + " " + sum);
		}

	}
}