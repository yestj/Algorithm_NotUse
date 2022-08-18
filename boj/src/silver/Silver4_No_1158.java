package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver4_No_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> people = new LinkedList<>();

		// 큐에 사람 차례대로 입력하기.
		for (int i = 1; i <= N; i++) {
			people.add(i);
		}
		
		// 결과값 출력을 위한 Stringbuilder 선언.
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		// 큐의 사이즈가 0이 될 때까지 k앞자리는 뒤로 보내고,
		// k번째 수는 빼서 stringbuilder에 추가해주기.
		while (people.size() != 0) {
			for (int i = 0; i < K - 1; i++) {
				int temp = people.remove();
				people.add(temp);
			}
			int temp = people.remove();
			sb.append(temp);
			sb.append(", ");
		}
		
		// stringbuilder 마지막의 ", "는 삭제.
		sb.delete(sb.length() - 2, sb.length());
		sb.append(">");
		// 최종 출력.
		System.out.println(sb.toString());

	}
}