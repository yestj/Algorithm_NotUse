package lv3;

import java.util.Scanner;

public class No_1209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 10개 테스트 반복.
		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();
			
			// 100*100 배열 생성.
			int[][] map = new int[100][100];
			// 값 입력 받기.
			for(int r = 0; r < 100; r++) {
				for(int c = 0; c < 100; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			// max값을 입력 받을 변수 선언.
			int max = 0;
			// 대각선 합 검증
			int temp1 = 0;
			int temp2 = 0;
			for(int r =0; r<100; r++) {
				temp1 += map[r][r];
				temp2 += map[r][99-r];
			}
			if(temp1 > max) max = temp1;
			if(temp2 > max) max = temp2;
			
			// 가로, 세로 합계 검증
			for(int r = 0; r<100; r++) {
				temp1 = 0;
				temp2 = 0;
				for (int c = 0; c < 100; c++) {
					temp1 += map[r][c];
					temp2 += map[c][r];
				}
				if(temp1 > max) max = temp1;
				if(temp2 > max) max = temp2;
			}
			
			
			// 출력하기.
			System.out.println("#"+tc+" "+max);
			
		}//for
	}//main
}