package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Silver4_No_12789 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// 현재 대기열.
		Queue<Integer> curr = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			curr.offer(sc.nextInt());
		}

		// 한 명씩만 설 수 있는 공간.
		Stack<Integer> waiting = new Stack<>();

		// 번호를 셀 카운트 변수 생성.
		int cnt = 1;

		// 대기열이 빌 때까지 아래 조건 문 반복.
		while (!curr.isEmpty()) {
			// 현재 대기열의 맨 앞 사람이 cnt와 똑같다면,
			if (curr.peek() == cnt) {
				curr.poll();
				cnt++;
			// 대기열이 비어있지 않고, 마지막으로 들어간 사람이 cnt와 똑같다면,
			} else if (!waiting.isEmpty() && waiting.peek() == cnt) {
				waiting.pop();
				cnt++;
			// 둘 다 충족하지 않을 경우 현재열에서 옆 대기열로 사람 이동.
			} else {
				waiting.push(curr.poll());
			}
		}
		
		// 마지막으로 대기공간에 들어온 사람이 cnt와 똑같을 때까지.
		while (!waiting.isEmpty() && waiting.peek() == cnt) {
			waiting.pop();
			cnt++;
		}
		
		// 대기열이 모두 비어있다면 성공.
		if (curr.isEmpty() && waiting.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}

	}

}
