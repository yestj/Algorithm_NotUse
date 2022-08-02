package bronze;

import java.util.Scanner;

public class Bronze1_No_10163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		
		// 1001x10001 색종이를 놓을 배열 생성
		int[][] map = new int[1001][1001];
		
		// 숫자를 받아 입력 좌표, 크기만큼 배열에 입력
		// 단, 색종이 순서대로 1, 2,... 순대로 숫자를 부여해줌
		// 중복이 될 경우, 마지막에 입력된 색종이의 숫자로 덮여짐
		for(int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();
			for (int j = x; j < x + width; j++) {
				for(int k = y; k < y+height; k++) {
					map[j][k] = i;
				}
			}
		}
		
		// 배열에 입력된 색종이 출력
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			cnt = 0;
			for(int j = 0; j<map.length; j++) {
				for(int k = 0; k<map[j].length; k++) {
					if(map[j][k] == i) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		
		
	}
}

