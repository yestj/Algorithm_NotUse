package d3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class No_1228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			// 원본 암호문 입력 받기.
			List<String> password = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				password.add(sc.next());
			}
			
			//암호를 검색하며, 원하는 위치에 삽입 명령 수
			int cmdNum = sc.nextInt();
			for (int i = 0; i < cmdNum; i++) {
				sc.next(); // 삽입 명령문(안 받아도 됨)
				int idx = sc.nextInt();
				int pwNum = sc.nextInt();
				for (int j = 0; j < pwNum; j++) {
					password.add(idx + j, sc.next());
				}
			}

			System.out.print("#" + tc);
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + password.get(i));
			}
			System.out.println();

		}
	}

}