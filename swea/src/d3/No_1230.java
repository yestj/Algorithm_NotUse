package d3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class No_1230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			
			// 원본 암호문 입력 받기.
			List<String> password = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				password.add(sc.next());
			}
			
			// 입력 받은 명령어에 따라 명령 실행하기.
			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				String cmd = sc.next();
				switch (cmd) {
				// 삽입 명령.
				case "I":
					int x1 = sc.nextInt();
					int y1 = sc.nextInt();
					for (int j = 0; j < y1; j++) {
						password.add(x1 + j, sc.next());
					}
					break;
				// 삭제 명령.
				case "D":
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					for (int j = 0; j < y2; j++) {
						password.remove(x2);
					}
					break;
				// 후위 추가 명령.
				case "A":
					int y3 = sc.nextInt();
					for (int j = 0; j < y3; j++) {
						password.add(sc.next());
					}
					break;
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