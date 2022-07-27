package lv2;

import java.util.Scanner;

public class No_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Test case값 입력 받기.
		int T = sc.nextInt();
		
		// 돈의 종류를 저장하고 있는 배열 만들기.
		int[] bills = {50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10};
		
		// Test case만큼 반복하기.
		for (int tc = 1; tc <= T; tc++) {
			// 거스름돈 입력 받기.
			int N = sc.nextInt();
			// 거스름돈 8종류별 각 몇 개씩 주어야 하는지를 저장할 빈 배열 생성
			int[] change = new int[8];
			
			// bill 배열을 돌며 큰 단위부터 나누어 몫을 change배열에 입력하고 기존 N 에서 몫*단위 만큼 값을 빼 준다.
			for (int i = 0; i < bills.length; i++) {
				change[i] = N / bills[i];
				N -= change[i] * bills[i];
			}
			
			// 출력하기.
			System.out.println("#" + tc);
			for (int i = 0; i < change.length; i++) {
				System.out.print(change[i] + " ");
			}
			System.out.print("\n");
		}
	}
}