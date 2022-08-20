package d3;

import java.util.Scanner;

public class No_3499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[] card = new String[N];
			for(int i = 0; i < N; i++) {
				card[i] = sc.next();
			}
			
			String[] result = new String[N];
			if(N%2 == 0) {
				for(int i = 0; i < N/2; i++) {
					result[2*i] = card[i];
					result[2*i+1] = card[N/2+i];
				}
			} else {
				for(int i = 0; i < N/2; i++) {
					result[2*i] = card[i];
					result[2*i+1] = card[N/2+i+1];
				}
				result[N-1] = card[N/2];
			}
			
			System.out.print("#"+tc);
			for(String x : result) {
				System.out.print(" " + x);
			}
			System.out.println();
			
		}

	}

}
