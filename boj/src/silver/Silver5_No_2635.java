package silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Silver5_No_2635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 최대 개수를 구할 수 있는 cnt변수 정의.
		int maxCnt = 0;
		int idx = 1;
		
		List<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= N; i++) { 
			numList.clear();
			numList.add(N);
			numList.add(i);
			int cnt = 2;
			while(numList.get(cnt-2)-numList.get(cnt-1) >= 0) {
				int result = (numList.get(cnt-2) - numList.get(cnt-1));
				numList.add(result);
				cnt++;
			}
			if(maxCnt <= cnt) {
				maxCnt = cnt;
			} else {
				idx = i-1;
				break;
			}
		}
		
		System.out.println(maxCnt);
		
		int[] result = new int[maxCnt];
		result[0] = N;
		result[1] = idx;
		for(int i = 2; i < maxCnt; i++) {
			result[i] = result[i-2] - result[i-1];
		}
		for(int x : result) {
			System.out.print(x + " ");
		}
		
	}
}
