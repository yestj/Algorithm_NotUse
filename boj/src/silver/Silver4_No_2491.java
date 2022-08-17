package silver;

import java.util.Scanner;

public class Silver4_No_2491 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numArr = new int[N];
		int cnt = 0;
		
		for(int i = 0 ; i < N; i++) {
			numArr[i] = sc.nextInt();
		}
		
		if(N == 1) {
			cnt = 1;
		} else {
			int temp = 1;
			// 배열을 돌며 연속하여 증가하는 최대 카운트 저장.
			for(int i = 1; i < N; i++) {
				if(numArr[i] < numArr[i-1]) {
					if(temp > cnt) {
						cnt = temp;
					}
					temp = 1;
				} else {
					temp++;
				}
			}
			if(temp > cnt) cnt = temp;
			
			// 배열을 돌며 연속하여 감소하는 최대 카운트 저장.
			temp = 1;
			for(int i = 1; i < N; i++) {
				if(numArr[i] > numArr[i-1]) {
					if(temp > cnt) {
						cnt = temp;
					}
					temp = 1;
				} else {
					temp++;
				}
			}
			if(temp > cnt) cnt = temp;
		}
		System.out.println(cnt);
		
	}

}
