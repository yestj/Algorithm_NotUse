package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze1_No_2309 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 아홉 난장이의 키를 받을 배열 생성.
		int[] dwarfs = new int[9];
		// 아홉 난장이의 키 입력받기.
		for (int i = 0; i < 9; i++) {
			dwarfs[i] = sc.nextInt();
		}
		// 아홉 난장이를 오름차순으로 정렬 후에, 키의 합 구하기.
		Arrays.sort(dwarfs);
		int sum = Arrays.stream(dwarfs).sum();
		
		// 반복적으로 2명을 뽑아 합계에서 빼주기.
		// 만약 뺐을 때의 합이 100일 경우, dwarfs배열의 해당 인덱스 값을 0으로 바꿔주기.
		test:
		for (int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				int temp = sum;
				temp -= (dwarfs[i] + dwarfs[j]);
				if (temp == 100) {
					dwarfs[i] = 0;
					dwarfs[j] = 0;
					break test;
				}
			}
		}
		
		// dwarfs 배열을 돌며, 값이 0일 경우를 제외하고 출력하기.
		for (int dwarf : dwarfs) {
			if(dwarf != 0) {
				System.out.println(dwarf);
			}
		}
		
	}

}
