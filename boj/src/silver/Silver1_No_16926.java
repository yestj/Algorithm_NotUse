package silver;

import java.util.Scanner;

public class Silver1_No_16926 {

	// 하, 우, 상, 좌
	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	static int[][] arr;
	static int arrIdx = 0;
	static int N;
	static int M;
	static int R;
	
	static int[][] result;
	static int resIdx = 0;
	
	static int resRow = 0;
	static int resCol = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();

		// 입력 값 저장할 배열.
		arr = new int[N][M];

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				arr[N][M] = sc.nextInt();
			}
		}

		// 결과값 저장할 배열.
		result = new int[N][M];

		// 시작점(0,0)을 기준으로 이동한 최종 위치를 Result배열에 입력.
		// min(N,M) mode 2 = 0 이므로, 시작점은 min(N,M)/2 번 설정할 수 있음.
		int cycle = Math.min(N, M) / 2;

		for (int i = 0; i < cycle; i++) {
			rotate(i, i);
			result[resRow][resCol] = arr[i][i];
			i += 
		}

	}
	
	static void rotate(int startRow, int startCol) {
		for(int i = 1; i <= R; i++) {
			int row = startRow + dr[arrIdx];
			int col = startCol + dc[arrIdx];
			if(row < 0 || row >= N || col < 0 || col >= M) {
				row -= dr[arrIdx];
				col -= dc[arrIdx];
				arrIdx = (arrIdx+1)%4;
			}
			resRow = row;
			resCol = col;
		}
	}
	
}
