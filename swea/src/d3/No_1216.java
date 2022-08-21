package d3;

import java.util.Scanner;

public class No_1216 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();

			// 2차원 배열에 문자 나누어 입력하기.
			char[][] arr = new char[100][100];
			for (int r = 0; r < 100; r++) {
				String input = sc.next();
				for (int c = 0; c < 100; c++) {
					arr[r][c] = input.charAt(c);
				}
			}

			int result = 0;
			for(int i = 100; i > 0; i--) {
				if(check(arr, i)) {
					result = i;
					break;
				}
			}
			
			
			System.out.println("#" + tc + " " + result);

		}
	}
	
	static boolean check(char[][] arr, int len) {
		
		for(int i = 0; i < 100; i++) {
			for (int j = 0; j <= 100-len; j++) {
				if(checkRow(arr, i, j, len) || checkCol(arr, j, i, len)) return true;
			}
		}
		
		return false;
		
	}
	
	// 가로 검사.
	static boolean checkRow(char[][] arr, int r, int c, int len) {
		for(int i = 0; i < len/2; i++) {
			if(arr[r][c+i] != arr[r][c+len-1-i]) return false;
		}
		return true;
	}
	
	// 세로 검사.
	static boolean checkCol(char[][] arr, int r, int c, int len) {
		for(int i = 0; i < len/2; i++) {
			if(arr[r+i][c] != arr[r+len-1-i][c]) return false;
		}
		return true;
	}

}
