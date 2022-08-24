package bronze;

import java.util.Scanner;

public class Bronze2_No_2798 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] card = new int[N];

		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int temp = card[i] + card[j] + card[k];
					if (temp > max && temp <= M) {
						max = temp;
					}
				}
			}
		}

		System.out.println(max);
	}

}
