package silver;

import java.util.Scanner;

public class Silver4_No_10157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int R = sc.nextInt();
		int K = sc.nextInt();
		
		int[] dr = {1, 0, -1, 0};
		int[] dc = {0, 1, 0, -1};
		int[][] hall = new int[R][C];
		int cnt = 1;
		
		// 대기 순번이 홀의 인원보다 클 때는 바로 0 출력 후 종료.
		if (K > C * R) {
			System.out.println(0);
		} else {
			// 대기 순서대로 홀 배열에 자리 배정하기.
			int row = 0;
			int col = 0;
			hall[row][col] =cnt++;
			int i = 0;
			while(cnt <= K) {
				// 경계 처리.
				if(dr[i]+row < 0 || dr[i]+row >= R || dc[i]+col < 0 || dc[i] +col >= C || hall[dr[i]+row][dc[i]+col] != 0) {
					i = (i+1)%4;
				} else {
					row += dr[i];
					col += dc[i];
					hall[row][col] = cnt++;
				}
			}
			System.out.println((col+1) + " " + (row+1));
		}
		

	}

}
