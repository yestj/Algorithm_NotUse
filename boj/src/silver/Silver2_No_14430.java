package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Silver2_No_14430 {

	static Integer[][] dp;
	static int[][] mine;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		dp = new Integer[N][M];
		mine = new int[N][M];
		
		// 광석 입력하기.
		for(int r = 0; r<N; r++) {
			for(int c = 0; c < M; c++) {
				mine[r][c] = sc.nextInt();
			}
		}
		
		// dp 입력하기.
		for(int r = 0; r < N; r++) {
			for(int c= 0; c< M; c++) {
				int max = 0;
				// 경계처리.
				if(r-1 >= 0 && dp[r-1][c] > max) max = dp[r-1][c];
				if(c-1 >= 0 && dp[r][c-1] > max) max = dp[r][c-1];
				dp[r][c] = max;
				if(mine[r][c] == 1) dp[r][c]++;
			}
		}
		
		// 가장 아래의 dp 값 출력하기.
		System.out.println(dp[N-1][M-1]);

	}

}
