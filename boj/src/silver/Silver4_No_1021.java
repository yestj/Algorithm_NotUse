package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver4_No_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		Queue<Integer> nums = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			nums.add(i);
		}

		int cnt = 0;

		for (int i = 0; i < M; i++) {
			int input = sc.nextInt();
			int temp = 0;
			int size = nums.size();
			while (nums.peek() != input) {
				nums.add(nums.poll());
				temp++;
			}
			if (temp > size / 2) {
				cnt += size - temp;
			} else {
				cnt += temp;
			}
			nums.poll();
		}

		System.out.println(cnt);
	}

}
