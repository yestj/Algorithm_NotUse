package bronze;

import java.util.Scanner;

public class Bronze1_No_2669 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// x좌표와 y좌표를 나타내는 2차원 배열 만들기.
		int[][] map = new int[100][100];
		
		// 입력을 4번 받으므로 4번 반복하기.
		for(int i = 0; i < 4; i++) {
			int xStart = sc.nextInt();
			int yStart = sc.nextInt();
			int xEnd = sc.nextInt();
			int yEnd = sc.nextInt();
			
			for(int x = xStart-1; x < xEnd-1; x++) {
				for(int y = yStart-1; y < yEnd-1; y++) {
					map[x][y] = 1;
				}
			}
		}
		
		// 면적의 합을 구할 변수 생성하기.
		int sum = 0;
		
		// 합 구하기.
		for(int x = 0; x < 100; x++) {
			for(int y = 0; y < 100; y++) {
				sum += map[x][y];
			}
		}
		
		System.out.println(sum);
		

	}

}
