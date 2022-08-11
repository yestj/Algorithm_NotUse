package lv2;

import java.util.Scanner;

public class No_1954 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 우, 하, 좌, 상 방향 설정.
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			int[][] map = new int[N][N];
			int cnt = 1;
			int i = 0;
			int r = 0;
			int c = 0;

			while (cnt <= N * N) {
				map[r][c] = cnt++;
				if (r + dr[i] >= N || r + dr[i] < 0 || c + dc[i] >= N || c + dc[i] < 0 || map[r+dr[i]][c+dc[i]] != 0) {
					i = (i + 1) % 4;
				}
				r += dr[i];
				c += dc[i];
			}

			// 출력하기.
			System.out.println("#" + tc);
			for(int fr = 0; fr < N; fr++) {
				for(int fc = 0; fc < N; fc++) {
					System.out.print(map[fr][fc]+" ");
				}
				System.out.println();
			}
		}

	}

}
