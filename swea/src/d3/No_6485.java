package d3;

import java.util.Scanner;

public class No_6485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			// 각 인덱스별로 버스가 몇 번 지나는지 카운트할 배열 생성.
			int[] cnt = new int[5001];
			
			// 각 버스 노선의 시작점과 끝 점을 받아 카운트하기.
			for (int i = 0; i < N; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				for (int j = start; j <= end; j++) {
					cnt[j]++;
				}
			}
			
			// 최종 버스노선의 값 입력하기.
			int P = sc.nextInt();
			int[] result = new int[P];
			for (int i = 0; i < P; i++) {
				int temp = sc.nextInt();
				result[i] = cnt[temp];
			}
			System.out.print("#" + tc + " ");
			for (int x : result) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
