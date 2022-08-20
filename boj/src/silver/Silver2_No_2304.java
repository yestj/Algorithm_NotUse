package silver;

import java.util.Scanner;

public class Silver2_No_2304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 창고의 시작 위치, 시작높이, 맥스 위치, 맥스 높이, 끝 위치, 끝 높이를 저장할 변수 생성.
		int startIdx = 1000;
		int startH = 0;
		int endIdx = 0;
		int endH = 0;
		int maxIdx = 0;
		int maxH = 0;

		// 값 들을 임시로 입력 받아, 시작 위치와 그 때의 기둥 높이 저장.
		int[][] temp = new int[N][2];

		// 값을 받으면서 필드들에 값 입력.
		for (int i = 0; i < N; i++) {
			temp[i][0] = sc.nextInt();
			temp[i][1] = sc.nextInt();
			if (temp[i][0] < startIdx) {
				startIdx = temp[i][0];
				startH = temp[i][1];
			}
			if (temp[i][0] > endIdx) {
				endIdx = temp[i][0];
				endH = temp[i][1];
			}
			if (temp[i][1] > maxH) {
				maxH = temp[i][1];
				maxIdx = temp[i][0];
			}
		}

		// 기둥의 시작, 끝 위치에 맞춰 각 인덱스에 높이를 저장할 수 있도록 배열 생성.
		int[] storage = new int[endIdx + 1 - startIdx];
		for (int i = 0; i < N; i++) {
			storage[temp[i][0] - startIdx] = temp[i][1];
		}

		// 시작 인덱스가 0으로 바뀌므로 이에 맞춰 max인덱스 조정
		// 맥스 인덱스를 기준으로 앞 뒤로 나눠 앞은 앞에서부터 탐색하며 높은 기둥을 만나면 증가
		// 뒤는 뒤에서 부터 탐색하며 높은 기둥을 만나면 증가
		maxIdx -= startIdx;
		int currH = startH;
		int sum = 0;

		for (int i = 0; i <= maxIdx; i++) {
			if (storage[i] > currH) {
				currH = storage[i];
			}
			sum += currH;
		}

		currH = endH;
		for (int i = storage.length - 1; i > maxIdx; i--) {
			if (storage[i] > currH) {
				currH = storage[i];
			}
			sum += currH;
		}

		// 값 출력.
		System.out.println(sum);

	}
}