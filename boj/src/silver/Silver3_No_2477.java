package silver;

import java.util.Scanner;

public class Silver3_No_2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1제곱미터당 자라는 참외의 개수 K
		int K = sc.nextInt();
		
		// 좌표를 저장할 배열 구하고 방향이 몇 번 나왔는지를 카운트할 배열 만들기.
		int[][] cdn = new int[6][2];
		int[] cnt = new int[5];
		for(int i = 0; i < 6; i++) {
			cdn[i][0] = sc.nextInt();
			cnt[cdn[i][0]]++;
			cdn[i][1] = sc.nextInt();
		}
		
		// 방향이 1번 나왔다는 것은, maxHeight, maxWidth값을 의미하므로 해당 방향값을 인덱스 변수에 저장.
		int wIdx = -1;
		int hIdx = -1;
		for(int i = 1; i < 3; i++) {
			if (cnt[i] == 1) {
				hIdx = i;
			}
		}
		for(int i = 3; i < 5; i++) {
			if(cnt[i] == 1) {
				wIdx = i;
			}
		}
		
		// 최대 가로, 세로 길이 저장하기.
		int maxWidth = 0;
		int maxHeight = 0;
		for(int i = 0; i < 6; i++) {
			if(cdn[i][0] == wIdx) {
				maxWidth = cdn[i][1];
			} else if (cdn[i][0] == hIdx) {
				maxHeight = cdn[i][1];
			}
		}
		
		// 빼야하는 가로, 세로 길이를 저장하기 위한 변수 생성.
		int sWidth = 0;
		int sHeight = 0;
		
		// 최대 가로, 세로와 인접하지 않은 가로, 세로가 빼야할 곳이므로 해당 길이 저장.
		for(int i = 0; i < 6; i++) {
			if(cdn[i][1] == maxWidth) {
				if(cdn[(i+1)%6][1] == maxHeight) {
					sHeight = cdn[(i+3)%6][1];
					sWidth = cdn[(i+4)%6][1];
					
				} else {
					sWidth = cdn[(i+2)%6][1];
					sHeight = cdn[(i+3)%6][1];
				}
			}
		}
		
		// 값 출력하기.
		int result = ((maxWidth*maxHeight) - (sWidth*sHeight))*K;
		System.out.println(result);
		
	}
}
