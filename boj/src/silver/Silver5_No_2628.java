package silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Silver5_No_2628 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 전체 가로, 세로 값 저장하기.
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		// 가로, 세로의 각 cutting 지점을 담을 ArrayList 생성.
		ArrayList<Integer> widthCut = new ArrayList<>();
		ArrayList<Integer> heightCut = new ArrayList<>();
		
		// 0과 종이의 max 값을 미리 리스트에 추가해주기.
		widthCut.add(0);
		widthCut.add(width);
		heightCut.add(0);
		heightCut.add(height);
		
		// cutting 지점 입력 받기.
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (temp == 0) {
				heightCut.add(sc.nextInt());
			} else {
				widthCut.add(sc.nextInt());
			}
		}
		
		// 커팅지점을 순서대로 자를 수 있도록 정렬하기.
		Collections.sort(widthCut);
		Collections.sort(heightCut);
		
		// 커팅지점 간 차이가 가장 큰 값을 구할 변수 설정하기.
		int maxWidth = -1;
		int maxHeight = -1;
		
		
		// 리스트 배열을 돌며 지점간 차이가 가장 큰 값 저장하기.
		for(int w = 1; w < widthCut.size(); w++) {
			int temp = widthCut.get(w) - widthCut.get(w-1);
			if (temp > maxWidth) {
				maxWidth = temp;
			}
		}
		
		for(int h = 1; h < heightCut.size(); h++) {
			int temp = heightCut.get(h) - heightCut.get(h-1);
			if (temp > maxHeight) {
				maxHeight = temp;
			}
		}
		
		// 넓이 출력하기.
		System.out.println(maxWidth * maxHeight);

	}

}
