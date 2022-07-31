package lv2;

import java.util.Scanner;

public class No_1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 입력 받은 N만큼 반복 
		for (int i = 1; i <= N; i++) {
			// int를 String 형태로 변환 
			String temp = Integer.toString(i);
			
			// 3, 6, 9가 몇 번 포함되었는지 세기 위한 변수 선언 및 초기
			int cnt = 0;
			
			// String에 3, 6, 9 문자가 포함되었는지 확인
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) {
				// 몇 개가 포함되었는지 확인
				for (int j = 0; j < temp.length(); j++) {
					// 한글자씩 비교하기 때문에, character type으로 비교해야 됨 "3" 으로 해서 계속 오류! '3'으로 입력해야 함.
					if(temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {
						cnt++;
					}
				}
				// cnt 개수만큼 - 출력
				for (int j = 0; j < cnt; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			} else {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		sc.close();
	}

}
