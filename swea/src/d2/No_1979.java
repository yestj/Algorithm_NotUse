package d2;

import java.util.Scanner;

public class No_1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Test case 수 입력받기.
		int T = sc.nextInt();
		
		// Test case 수만큼 반복하기.
		for (int tc = 1; tc <= T; tc++) {
			// 퍼즐의 길이 N, 단어의 길이 K 입력 받기.
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			// 입력받은 N길이의 2차원 배열 생성하기.
			int[][] puzzle = new int[N][N];
			// 배열에 입력값 집어 넣기.
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					puzzle[r][c] = sc.nextInt();
				}
			}
			
			// 단어가 들어갈 수 있는 자리를 찾으면 저장할 카운트 변수 생성하기.
			int cnt = 0;
			
			// 행을 이동하며 K길이의 단어가 들어갈 수 있는 곳 탐색.
			for (int r = 0; r < N; r++) {
				// 행을 이동하며 값을 더할 임시 변수 생성.
				int temp = 0;
				for (int c = 0; c < N; c++) {
					// 0을 만났을 때, 지금까지 더한 값이 K의 길이와 같다면 cnt++ 한 후 temp값 초기화.
					if(puzzle[r][c] == 0) {
						if(temp == K) { cnt++;}
						temp = 0;
					} else {
						// 0을 만나지 않았으면, 단어가 들어갈 수 있는 자리이므로 계속 더해줌.
						temp += puzzle[r][c];
					}
				}
				// 마지막 자리에 들어갈 수 있기 때문에 최종 값이 K의 길이와 같은지 확인.
				if(temp == K) {cnt++;}
			}

			// 열을 이동하며 K길이의 단어가 들어갈 수 있는 곳 탐색.
			for (int c = 0; c < N; c++) {
				int temp = 0;
				for (int r = 0; r < N; r++) {
					if(puzzle[r][c] == 0) {
						if (temp == K) { cnt++;}
						temp = 0;
					} else {
						temp += puzzle[r][c];
					}
				}
				if(temp == K) {cnt++;}
			}
			
			
			// 최종 값 출력하기.
			System.out.println("#" + tc + " " + cnt);
			
		}
	}
}
