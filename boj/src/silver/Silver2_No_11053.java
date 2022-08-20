package silver;

import java.util.Scanner;

public class Silver2_No_11053 {
	
	// LIS dp 를 저장할 static 배열 선언.
	static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 받은 배열의 크기에 맞춰 값을 저장할 nums배열을 만들고, dp의 크기도 설정.
		int N = sc.nextInt();
		int[] nums = new int[N];
		dp = new Integer[N];

		// nums배열에 값 입력받기.
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		// dp 에 값 입력하기.
		for(int i = 0; i < N; i++) {
			incsMax(nums, i);
		}
		
		// max 1로 두고 dp 배열을 돌며 max 값 찾기.
		int max = 1;
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i]);
		}
		
		// 출력하기.
		System.out.println(max);

	}
	
	// 값이 증가하는지를 확인.
	public static int incsMax(int[] arr, int idx) {

		if (arr.length == 1)
			return 1;

		if (dp[idx] == null) {
			dp[idx] = 1;

			int temp = 0;
			for (int i = 0; i < idx; i++) {
				if (arr[i] < arr[idx]) {
					if (dp[i] > temp) {
						temp = dp[i];
						dp[idx] = dp[i]+1;
					}
				}
			}
		}
		
		return dp[idx];
	}

}
