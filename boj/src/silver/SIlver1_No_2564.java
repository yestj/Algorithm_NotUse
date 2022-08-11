package silver;

import java.util.Arrays;
import java.util.Scanner;

public class SIlver1_No_2564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int height = sc.nextInt();

		int N = sc.nextInt();
		// 각 상점과 경비업체의 위치 좌표 저장할 2차원 배열 생성하고 입력받기.
		int[][] cdn = new int[N + 1][2];
		for (int i = 0; i <= N; i++) {
			int direction = sc.nextInt();
			switch (direction) {
			case 1:
				cdn[i][0] = sc.nextInt();
				cdn[i][1] = height;
				break;
			case 2:
				cdn[i][0] = sc.nextInt();
				cdn[i][1] = 0;
				break;
			case 3:
				cdn[i][0] = 0;
				cdn[i][1] = height - sc.nextInt();
				break;
			case 4:
				cdn[i][0] = width;
				cdn[i][1] = height - sc.nextInt();
				break;
			}
		}
		int min = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			temp = 0;
			int tempMin = 0;
			// 경비원과 같은 축에 위치한 상점일 경우.
			// 단순히 같을 때 라고 하면, 같은 축이 아닌 특정 좌표가 똑같은 지점도 호출이 되니 주의.
			if ((cdn[i][0]+cdn[N][0] == 2*width) || (cdn[i][1]+cdn[N][1] == 2*height)) {
				temp += Math.abs(cdn[i][0] + cdn[i][1] - cdn[N][0] - cdn[N][1]);
			// 경비원과 블록의 정반대에 위치한 상점일 경우.
			} else if (Math.abs(cdn[i][0] - cdn[N][0]) == width || Math.abs(cdn[i][1] - cdn[N][1]) == height) {
				tempMin = cdn[i][0] + cdn[i][1] + cdn[N][0] + cdn[N][1];
				if ((width + height) * 2 - tempMin < tempMin) {
					tempMin = (width + height) * 2 - tempMin;
				}
				temp += tempMin;
			//경비원 사이드축에 위치한 상점일 경우.
			} else {
				temp += Math.abs(cdn[i][0] - cdn[N][0])+Math.abs(cdn[i][1]-cdn[N][1]);
			}
			min += temp;
		}

		System.out.println(min);

	} // main
}
