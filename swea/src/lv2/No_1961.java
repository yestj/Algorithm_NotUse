package lv2;

import java.util.Scanner;

public class No_1961 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			// N의 개수 입력 받고 해당 크기의 2차원 배열 만든 후 값 입력 받기.
			int N = sc.nextInt();
			String[][] strArr = new String[N][N];
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					strArr[r][c] = sc.next();
				}
			}

			// 결과값 저장할 배열 생성.
			String[][] result = new String[N][3];
			for (int i = 0; i < N; i++) {
				// 90도 회전 결과 저장.
				String temp0 = "";
				// 180도 회전 결과 저장.
				String temp1 = "";
				// 270도 회전 결과 저장.
				String temp2 = "";
				for (int j = 0; j < N; j++) {
					temp0 += strArr[N - 1 - j][i];
					temp1 += strArr[N - 1 - i][N - 1 - j];
					temp2 += strArr[j][N - 1 - i];
				}
				result[i][0] = temp0;
				result[i][1] = temp1;
				result[i][2] = temp2;
			}

			// 출력하기.
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
