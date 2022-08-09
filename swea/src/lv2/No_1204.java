package lv2;

import java.util.Scanner;

public class No_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int tc = sc.nextInt();
			
			// 점수 개수를 카운트할 배열 생성하기. 인덱스 1~100을 활용하기 위해 101크기의 배열 생성.
			// 각 인덱스에 해당하는 점수를 입력 받으면 카운트++
			int[] scores = new int[101];
			for(int i = 0; i < 1000; i++) {				
				scores[sc.nextInt()]++;
			}
			
			// 최빈값과 그 때의 인덱스(점수)를 저장할 변수 생성하기.
			int idx = -1;
			int max = 0;
			for(int i = 0; i < 101; i ++) {
				if(scores[i] >= max) {
					max = scores[i];
					idx = i;
				}
			}
			
			// 출력하기.
			System.out.println("#"+tc+" "+idx);
		}
	}
}
