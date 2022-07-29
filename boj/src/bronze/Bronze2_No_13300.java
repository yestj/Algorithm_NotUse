package bronze;

import java.util.Scanner;

public class Bronze2_No_13300 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 수학여행에 참가하는 학생수 N, 한 방에 배정할 수 있는 최대 인원 수 K 입력 받기
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		// 성별과 학년을 저장할 배열 생성하기.
		int[][] student = new int[2][6];
		
		// 학생 수 만큼 for문을 돌며 각각 성별, 학년 배열에 각각 넣어주기.
		for(int i = 0; i < N; i++) {
			int sex = sc.nextInt();
			int grade = sc.nextInt() - 1;
			student[sex][grade]++;
		}
		
		int room = 0;
		for(int s = 0; s < 2; s++) {
			for(int g = 0; g < 6; g++) {
				room += student[s][g] / K;
				if(student[s][g] % K != 0) room++;
			}
		}
		System.out.println(room);

	} 
		
}

