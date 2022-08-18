package d3;

import java.util.Scanner;

public class No_1213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 10번 반복.
		for (int t = 0; t < 10; t++) {
			int tc = sc.nextInt();
			String tgStr = sc.next();
			String testStr = sc.next();
			int tgIdx = tgStr.length() - 1;
			int testIdx = testStr.length() - 1;
			
			int cnt = 0;
			for (int i = 0; i <= testIdx - tgIdx; i++) {
				int tempCnt = 0;
				for(int j = 0; j <= tgIdx; j++) {
					if(testStr.charAt(i+j) == tgStr.charAt(j)) {
						tempCnt++;
					}
				}
				if (tempCnt == tgIdx +1) cnt++;
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
}
