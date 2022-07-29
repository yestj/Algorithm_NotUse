package bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bronze2_No_2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 수 입력 받기.
		int N = sc.nextInt();
		// 학생 순서를 받을 ArrayList 생성.
		List<Integer> student = new ArrayList<>();
		
		// 학생 수만큼 for문을 돌면서 인덱스에 값 넣기.
		// ArrayList는 값이 있는 인덱스에 다른 값을 넣을 경우, 인덱스가 뒤로 한 개씩 밀린다.
		for (int i = 0; i < N; i++) {
			// 학생이 뽑은 카드 만큼 얼마나 앞으로 가야 하는지 저장.
			int forward = sc.nextInt();
			// 카드의 숫자만큼 인덱스 조정, 학생의 번호는 1부터 시작하므로 i+1. 
			student.add((i-forward), i + 1);
		}
		
		// 출력하기. 
		for(int i = 0; i < student.size(); i++) {
			System.out.print(student.get(i)+" ");
		}
	}

}
