package d3;

import java.util.Scanner;

public class No_1216 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();

			char[][] arr = new char[100][];
			for (int i = 0; i < 100; i++) {
				String row = sc.next();
				arr[i] = row.toCharArray();
			}

			int maxLen = 0;
			// 가로 탐색.
			for (int r = 0; r < 100; r++) {
				for (int c = 0; c < 100; c++) {
					for (int len = 100; len>0; len--) {
						
					}
				}
			}
		}
	}

}
