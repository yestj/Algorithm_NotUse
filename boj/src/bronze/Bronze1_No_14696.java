package bronze;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bronze1_No_14696 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 딱지놀이 총 라운드 수 입력받기.
		int N = sc.nextInt();
		
		for(int n = 0; n < N; n++) {
			// A가 갖고 있는 딱지의 개수와 숫자 입력 받기.
			int aHave = sc.nextInt();
			String[] aTtakji = new String[aHave];
			for(int a = 0; a < aHave; a++) {
				aTtakji[a] = sc.next();
			}
			// B가 갖고 있는 딱지의 개수와 숫자 입력 받기.
			int bHave = sc.nextInt();
			String[] bTtakji = new String[bHave];
			for(int b = 0; b < bHave; b++) {
				bTtakji[b] = sc.next();
			}
			
			// 4(별)부터 돌면서, 각 배열에 해당 숫자가 더 많은 사람을 출력하고 for문을 나가도록 함.
			// frequency함수에 그냥 int 타입 숫자를 넣어서 돌리니 찾지를 못해서 String 타입으로 바꿔줌
			// 둘이 무승부일 경우 cnt 값을 초기화
			// 끝까지 cnt 값이 0일 경우는 D출력.
			int aCnt = 0;
			int bCnt = 0;
			for(int i = 4; i > 0; i--) {
				aCnt = Collections.frequency(Arrays.asList(aTtakji), Integer.toString(i));
				bCnt = Collections.frequency(Arrays.asList(bTtakji), Integer.toString(i));
				if (aCnt > bCnt) {
					System.out.println("A");
					break;
				} else if (aCnt < bCnt) {
					System.out.println("B");
					break;
				} else {
					aCnt = 0;
					bCnt = 0;
				}
			}
			
			if(aCnt == 0 && bCnt == 0) {
				System.out.println("D");
			}
			
			
		}

	}

}
