package d3;

import java.util.ArrayList;
import java.util.Scanner;

public class No_6190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수 입력 받기 
		int T = sc.nextInt();
		
		// 테스트 케이스 수만큼 반복하기 
		for (int tc = 1; tc <= T; tc++) {
			// 몇 개의 숫자를 받을 것인지 입력 받기 
			int N = sc.nextInt();
			// N만큼의 길이를 가진 배열 만들기
			int[] numArr = new int[N];
			// 배열에 입력값 넣기 
			for (int i = 0; i < numArr.length; i++) {
				numArr[i] = sc.nextInt();
			}
			// 배열의 각 값들을 곱하여 배열에 저장 
			ArrayList<String> multipliedArr = new ArrayList<String>();
			for(int i = 0; i < numArr.length; i++) {
				for(int j = i + 1; j < numArr.length; j++) {
					multipliedArr.add(Integer.toString(numArr[i]*numArr[j]));
				}
			}
			
			// max값 설정을 위해 변수 선언
			int max = -1;
			
			// multipliedArr 배열안의 각 String 숫자에 대해 단조 증가하는지 확인
			for (String num : multipliedArr) {
				int temp = 0;
				test: 
				for (int i = 0; i < num.length(); i++) {
					if ((num.charAt(i)-'0') >= temp) {
						temp = num.charAt(i)-'0';
					} else {
						temp = -1;
						break test;
					}
				}
				if (temp > 0 && Integer.parseInt(num) > max) {
					max = Integer.parseInt(num);
				}
			}
			
			// 출력하기
			System.out.println("#" + tc + " " + max);
			
			
			
		}

	}

}
