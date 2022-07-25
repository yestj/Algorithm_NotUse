package lv2;

import java.util.Scanner;

public class No_1859 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// receive the number of test case
		int T = sc.nextInt();
		
		// test case만큼 코드 반복
		for (int tc = 1; tc <= T; tc++) {
			
			// 며칠간의 데이터를 얻을 것인지를 입력 받기 
			int days = sc.nextInt();
			// 결과 값 
			long sum = 0;
			
			// 입력 받은 날의 크기와 같은 배열 생성 
			int[] priceArr = new int[days];
			
			// 배열에 각 날의 매매가 입력 받음 
			for (int day = 0; day < days; day++) {
				priceArr[day] = sc.nextInt();
			}
			
			int temp = 0;
			
			// temp가 더 클 경우에만 양수를 더하게 되고, 나머지는 계속 0을 더하게 되는 구조! 
			for (int day = days-1; day >= 0; day--) {
				if (temp < priceArr[day]) {
					temp = priceArr[day];
				}
				sum += temp - priceArr[day];
			}
			
			System.out.printf("#" + tc + " " + sum + "\n");
			// 줄바꿈을 추가 안해줘서 계속 오류 발생..! 주의할 것! 
		}
		sc.close();
	}
}
