package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bronze2_No_13300 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 수학여행에 참가하는 학생수 N, 한 방에 배정할 수 있는 최대 인원 수 K 입력 받기
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// 성별과 학년을 저장할 배열 생성하기.
		String[] sex = new String[N];
		int[] grade = new int[N];
		
		// 학생 수 만큼 for문을 돌며 각각 성별, 학년 배열에 각각 넣어주기.
		for(int n = 0; n < N; n++) {
			sex[n] = sc.next();
			grade[n] = sc.nextInt();
		}
		
		// 각 학년별 index에 성별 저장할 수 있는 다차원 배열 만들기
		List[] student = new List[6];
		for(int i = 0; i < 6; i++) {
			// 각 학년별 학생수는 알 수 없으므로 배열 안에 ArrayList를 만들어준다.
			student[i] = new ArrayList<>();
		}
		
		// 각 index로 지칭되는 학년에 성별 정보 넣기.
		for(int i = 0; i < N; i++) {
			student[grade[i]-1].add(sex[i]);
		}
		
		// 2차원 배열을 돌며 방의 개수 카운트.
		int room = 0;
		
		for(int i = 0; i < 6; i++) {
			
		}

	}
		
}

