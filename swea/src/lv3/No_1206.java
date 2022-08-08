package lv3;

import java.util.Scanner;

public class No_1206 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10개의 테스트케이스만큼 반복하기.
		for(int tc = 1; tc <= 10; tc++) {
			// 도시 가로의 길이 입력받기.
			int width = sc.nextInt();
			// 빌딩의 높이 입력 받을 배열 만들어 입력 받기.
			int[] bldgH = new int[width];
			for(int i = 0; i < width; i++) {
				bldgH[i] = sc.nextInt();
			}
			//조망권 확보된 세대의 수를 카운트할 변수 생성.
			int cnt = 0;
			
			// 3번째 인덱스를 기준으로 1, 2, 4, 5번째 인덱스의 값을 빼준 후 최소값을 저장.
			// 이 때 음수일 경우, 조망권이 없으므로 제외.
			for (int i = 2; i < width-2; i++) {
				int min = 255;
				for(int j = 1; j <= 2; j++) {
					int temp = bldgH[i] - bldgH[i-j];
					if(temp < min) min = temp;
					temp = bldgH[i] - bldgH[i+j];
					if(temp < min) min = temp;
				}
				if (min > 0) cnt += min;
			}
			System.out.println("#"+tc+" "+cnt);
		}

	}

}
