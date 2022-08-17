package silver;

import java.util.Scanner;

public class Silver3_No_2559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] numArr = new int[N];
		for (int i = 0; i < N; i++) {
			numArr[i] = sc.nextInt();
		}
		
		// maxSum을 0으로 설정할 경우, 온도 값이 모두 음수일 경우 오류 발생.
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i <= N - K; i++) {
			int tempSum = 0;
			for (int j = 0; j < K; j++) {
				tempSum += numArr[i + j];
			}
			if (tempSum > maxSum)
				maxSum = tempSum;
		}

		System.out.println(maxSum);
	}
}
