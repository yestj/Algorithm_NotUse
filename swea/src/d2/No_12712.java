package d2;

import java.util.Scanner;

public class No_12712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// 8방 탐색(동, 서, 남, 북, 북동, 북서, 남동, 남서)
		int[] dr = {1, -1, 0, 0, 1, -1, 1, -1};
		int[] dc = {0, 0, 1, -1, -1, -1, 1, 1};
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] map = new int[N][N];
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			int max = 0;
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					int temp = 0;
					temp += map[r][c];
					// + 방향 탐색
					for (int m = 1; m < M; m++) {
						for(int i = 0; i < 4; i++) {
							int nr = r + dr[i] * m;
							int nc = c + dc[i] * m;
							if(nr >= 0 && nc >= 0 && nr < N && nc < N) {
								temp += map[nr][nc];
															}
						}
					}
					if (temp > max) max = temp;
					
					// x 방향 탐색
					temp = map[r][c];
					for (int m = 1; m < M; m++) {
						for(int i = 4; i < 8; i++) {
							int nr = r + dr[i] * m;
							int nc = c + dc[i] * m;
							if(nr >= 0 && nc >= 0 && nr < N && nc < N) {
								temp += map[nr][nc];
															}
						}
					}
					if (temp > max) max = temp;
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}
}
