package bronze;

import java.util.Scanner;

public class Bronze1_No_2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 색종이 수 입력받기.
		int N = sc.nextInt();
		
		// 도화지 2차원 배열 그리기.
		int[][] map = new int[100][100];
	
		
		// 검은 색종이가 차지하는 모든 인덱스에 1을 넣으면 넓이의 값과 똑같음(10*10 배열이 되므로)
		// 입력 받는 값에 +10을 더해 해당 인덱스에 1을 반복해서 넣을 경우 별도 중복처리를 해주지 않아도 됨.
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					map[j][k] = 1;
				}
			}
		}
		
		// 입력 완료된 2차 배열의 합 구하기.
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				sum += map[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
