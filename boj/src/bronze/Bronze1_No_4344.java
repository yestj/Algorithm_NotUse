package bronze;

import java.util.Scanner;

public class Bronze1_No_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// double int 를 섞어쓰다가 부동소수점 때문인지 계속 오류가 발생..!
		// 문제 풀 때 데이터타입은 웬만하면 계속 통일해서 쓰는 것이 좋을듯.
		for(int t = 0; t < T; t++) {
			int N = sc.nextInt();
			double[] scores = new double[N];
			double sum = 0;
			for(int i = 0; i < N; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			double avg = sum/N;
			double cnt = 0;
			for(int i = 0; i < N; i++) {
				if(scores[i] > avg ) {
					cnt++;
				}
			}
			
			double result = cnt/N*100;
			System.out.println(String.format("%.3f", result)+"%");
			
		}

	}

}
