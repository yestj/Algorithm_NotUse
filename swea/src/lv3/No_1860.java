package lv3;

import java.util.Arrays;
import java.util.Scanner;

public class No_1860 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트케이스 수 입력.
		int T = sc.nextInt();

		// 테스트케이스만큼 반복
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			// 사람 수 만큼 배열 만들어 값 입력.
			int[] customers = new int[N];
			for (int i = 0; i < N; i++) {
				customers[i] = sc.nextInt();
			}
			// 손님 도착 순서대로 오름차순 정렬.
			Arrays.sort(customers);
			int leftBread = 0;
			for (int i = 1; i <= N; i++) {
				leftBread = customers[i-1] / M * K - i;
				if (leftBread < 0) {
					break;
				}
			}
			if (leftBread < 0) {
				System.out.println("#" + tc + " Impossible");
			} else {
				System.out.println("#" + tc + " Possible");
			}

		}

	}// main

}
