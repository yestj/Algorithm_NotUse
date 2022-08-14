package silver;

import java.util.Scanner;

public class SIlver4_No_2567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 둘레의 길이 == 1이 접하고 있는 0의 개수.
		// 색종이가 도화지 끝 면에 붙여진 상황을 고려하기 위해 도화지 크기를 +1 씩 더 늘려줌.
		int N = sc.nextInt();
		int[][] grid = new int[102][102];
		
		// 도화지에 색종이 붙이기.
		for (int i = 0; i < N; i++) {
			int cStart = sc.nextInt();
			int rStart = sc.nextInt();
			for(int r = rStart; r < rStart+10; r++) {
				for(int c = cStart; c < cStart+10; c++) {
					grid[r][c] = 1;
				}
			}
		}
		
		// 4방탐색을 위한 배열 생성.
		int[] dc = {-1, 1, 0, 0};
		int[] dr = {0, 0, -1, 1};
		int sum = 0;
		
		// 도화지를 탐색하며, 1일 경우 주위에 0이 몇 개 있는지 사방 탐색.
		for(int r = 0; r < 102; r++) {
			for(int c = 0; c < 102; c++) {
				if(grid[r][c] == 1) {
					for(int i = 0; i < 4; i++) {
						if(grid[r+dr[i]][c+dc[i]] == 0) {
							sum++;
						}
					}
				}
			}
		}
		
		// 출력하기.
		System.out.println(sum);

	}

}
