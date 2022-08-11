package d4;

import java.util.Scanner;

public class No_1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 10번 반복.
		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();

			// 100*100 배열 생성 및 데이터 입력 받기.
			int[][] ladder = new int[100][100];
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					ladder[r][c] = sc.nextInt();
				}
			}

			// Target 2의 위치 찾기.
			int r = 99;
			int c = -1;
			for (int i = 0; i < 100; i++) {
				if (ladder[99][i] == 2) c = i;
			}
			
			// while문을 돌며 사다리 위로 올라가기.
			while (r > 0) {
				if (c - 1 >= 0 && ladder[r][c - 1] == 1) {
					ladder[r][c--] = 0;
				} else if (c + 1 < 100 && ladder[r][c + 1] == 1) {
					ladder[r][c++] = 0;
				} else {
					r--;
				}
			}

			System.out.println("#" + tc + " " + c);
		}

	}

}
