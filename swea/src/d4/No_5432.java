package d4;

import java.util.Scanner;

public class No_5432 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1 ; tc <= T; tc++) {
			String input = sc.next();
			char[] stick = new char[input.length()];
			
			// 배열에 각 괄호 넣어주기.
			for(int i = 0; i < input.length(); i++) {
				stick[i] = input.charAt(i);
			}
			
			// 총합과 현재 남은 막대기를 cnt해주는 변수 생성.
			int sum = 0;
			int cnt = 0;
			
			// '('를 만나면 일단 cnt++ (막대기라고 가정)
			// ')'을 만나면 앞이 1. '('라면 레이저이고, 2. ')'라면 막대기의 끝.
			// 1. 레이저일 경우, 현재의 cnt 값을 sum에 더해 줌.
			// 2. 막대기의 끝일 경우 sum에 막대기의 끝 +1을 해줌.
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] == '(') {
					cnt++;
				} else {
					cnt--;
					if(stick[i-1] == '(') {
						sum += cnt;
					} else {
						sum += 1;
					}
				}
			}
			
			System.out.println("#"+tc+" "+sum);
			
		}
		

	}

}
