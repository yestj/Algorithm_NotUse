package d3;

import java.util.Scanner;

public class No_1215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {

			// 회문 길이 입력받기.
			int N = sc.nextInt();

			// 배열 입력받기.
			char[][] charArr = new char[8][8];
			for (int r = 0; r < 8; r++) {
				String temp = sc.next();
				for (int c = 0; c < 8; c++) {
					charArr[r][c] = temp.charAt(c);
				}
			}

			// 가로 세로 검색용 신규 배열, 입력하기.
			String[] hLine = new String[8];
			String[] vLine = new String[8];

			for (int i = 0; i < 8; i++) {
				hLine[i] = "";
				vLine[i] = "";
				for (int j = 0; j < 8; j++) {
					hLine[i] += charArr[i][j];
					vLine[i] += charArr[j][i];
				}
			}
			
			// 회문검사.
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - N + 1; j++) {
					String temp1 = "";
					String temp2 = "";
					temp1 = hLine[i].substring(j, j + N);
					temp2 = vLine[i].substring(j, j + N);
					StringBuffer sb1 = new StringBuffer(temp1);
					StringBuffer sb2 = new StringBuffer(temp2);
					String revTemp1 = sb1.reverse().toString();
					String revTemp2 = sb2.reverse().toString();
					if (temp1.equals(revTemp1)) {
						cnt++;
					}
					if (temp2.equals(revTemp2)) {
						cnt++;
					}
				}
			}

			System.out.println("#" + tc + " " + cnt);
		}
	}

}
