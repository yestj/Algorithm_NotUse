package d3;

import java.util.Arrays;
import java.util.Scanner;

public class No_1208 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			// 덤프 횟수 입력 받기.
			int dump = sc.nextInt();
			
			// 박스의 높이 입력 받기.
			int[] boxes = new int[100];
			for (int i = 0; i < 100; i++) {
				boxes[i] = sc.nextInt();
			}
			
			// 결과를 저장할 변수 선언하기.
			int result = 0;
			
			// 덤프 횟수만큼 반복 수행. 단, 덤프횟수에 딱 맞게 평탄화가 끝날 경우 result값 오류가 발생할 수 있어 dump횟수보다 +1을 추가.
			for (int d = 0; d <= dump; d++) {
				// 박스를 오름차순으로 정렬.
				Arrays.sort(boxes);
				
				// 박스의 평탄화가 완료될 경우 0값을 반환하고 for문 종료.
				if(boxes[0] == boxes[boxes.length-1]) {
					result = boxes[boxes.length-1] - boxes[0];
					break;
					// 아닐 경우, max, min간의 차이를 result로 반환하고 최소값에 +1, 최대값에 -1로 평탄화 작업을 해줌.
				} else {
					result = boxes[boxes.length-1] - boxes[0];
					boxes[0]++;
					boxes[boxes.length-1]--;
				}
			}
			// 출력하기.
			System.out.println("#"+tc+" "+result);		
		}
	}
}
