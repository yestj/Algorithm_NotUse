package silver;

import java.util.Scanner;

public class Silver2_No_2615 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[19][19];
		for (int r = 0; r < 19; r++) {
			for (int c = 0; c < 19; c++) {
				board[r][c] = sc.nextInt();
			}
		}

		// 5목인지 아닌지 판별하기 위한 카운트 변수 선언.
		// 5목일 경우, 승자와 위치를 저장할 변수 선언.
		int cnt = 0;
		int winner = -1;
		int row = -1;
		int col = -1;

		// 보드를 돌며 1이나 2를 만날 경우, 승자가 있는지 검사하는 메소드 수행.
		// 수행한 메소드 카운트 값이 5일 경우, 해당 위치와 승자의 값을 변수에 저장.
		test: for (int r = 0; r < 19; r++) {
			for (int c = 0; c < 19; c++) {
				if (board[r][c] == 1 || board[r][c] == 2) {
					cnt = isWin(board, r, c, board[r][c]);
					if (cnt == 5) {
						winner = board[r][c];
						row = r + 1;
						col = c + 1;
						break test;
					}
				}
			}
		}

		// 출력하기.
		if (cnt == 5) {
			System.out.println(winner);
			System.out.println(row + " " + col);
		} else {
			System.out.println(0);
		}

	}

	static int isWin(int[][] arr, int r, int c, int value) {

		// 가장 왼쪽의 row, col값을 출력해야 하기 때문에 방향을 오른쪽, 오른쪽아래, 아래, 왼쪽위로 가는 것만 검사.
		int[] dr = { 1, 1, -1, 0 };
		int[] dc = { 0, 1, 1, 1 };

		// 같은 값이 몇 번 나오는지를 셀 카운트 변수 생성.
		int cnt = 0;
		test: for (int i = 0; i < 4; i++) {
			int row = r + dr[i];
			int col = c + dc[i];

			// 경계 안에 있고, value값이 동일하다면 계속해서 같은 방향으로 움직임.
			cnt = 1;
			while (row >= 0 && row < 19 && col >= 0 && col < 19 && arr[row][col] == value) {
				row += dr[i];
				col += dc[i];
				cnt++;
			}
			// 만약 5일 경우, 6목이 아닌지 검사하기 위해 반대 방향만 한 번 더 검사.
			if (cnt == 5) {
				int tempRow = r - dr[i];
				int tempCol = c - dc[i];
				if (tempRow >= 0 && tempRow < 19 && tempCol >= 0 && tempCol < 19 && arr[tempRow][tempCol] == value) {
					cnt = 0;
					continue test;
				} else {
					// 5목일 경우 test 종료하고 값 반환.
					break test;
				}
			}
		}
		return cnt;
	}

}
