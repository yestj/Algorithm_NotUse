package silver;

import java.util.Scanner;

public class Silver4_No_2578 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 빙고판에 숫자 입력 받기.
		int[][] bingo = new int[5][5];
		for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 5; c++) {
				bingo[r][c] = sc.nextInt();
			}
		}
		
		// 숫자 하나를 받을 때마다 빙고판에서 숫자를 찾아 0으로 바꿔준 뒤,
		// 빙고 판별 메소드 실행.
		int bingoCnt = 0;
		int cnt = 0;
		while(bingoCnt < 3) {
			int N = sc.nextInt();
			cnt++;
			find: for(int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if(N == bingo[r][c]) {
						bingo[r][c] = 0;
						bingoCnt = isBingo(bingo);
						break find;
					}
				}
			}
		}
		System.out.println(cnt);
	}
	
	// 빙고 검사를 할 메소드 생성. (가로, 세로, 대각선 탐색)
	public static int isBingo(int[][] arr) {
		int cnt = 0;
		
		int temp3 = 0;
		int temp4 = 0;
		for(int i = 0; i < 5; i++) {
			int temp1 = 0;
			int temp2 = 0;
			temp3 += arr[i][i];
			temp4 += arr[i][4-i];
			for(int j = 0; j < 5; j++) {
				temp1 += arr[i][j];
				temp2 += arr[j][i];
			}
			if (temp1 == 0) cnt++;
			if (temp2 == 0) cnt++;
		}
		if (temp3 == 0) cnt++;
		if (temp4 == 0) cnt++;
		return cnt;
	}

}
