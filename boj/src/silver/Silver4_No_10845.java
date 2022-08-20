package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver4_No_10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Queue<Integer> numList = new LinkedList<>();
		int rear = -1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String cmd = sc.next();
			int result = 0;

			switch (cmd) {
			case "push":
				rear = sc.nextInt();
				numList.add(rear);
				break;
			case "pop":
				if (numList.size() == 0)
					result = -1;
				else
					result = numList.remove();
				break;
			case "size":
				result = numList.size();
				break;
			case "empty":
				if (numList.isEmpty())
					result = 1;
				else
					result = 0;
				break;
			case "front":
				if (numList.size() == 0)
					result = -1;
				else
					result = numList.peek();
				break;
			case "back":
				if (numList.size() == 0)
					result = -1;
				else
					result = rear;
				break;
			}
			
			// StringBuilder가 아닌 print로 풀 경우에는 시간 초과 발생.
			if (!"push".equals(cmd)) {
				sb.append(result).append("\n");
			}
		}
		System.out.println(sb);

	}

}