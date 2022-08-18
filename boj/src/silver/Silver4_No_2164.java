package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver4_No_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> card = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			card.add(i);
		}
		
		// 카드가 1장 남을 때 까지 반복.
		while(card.size() > 1) {
			card.remove();
			card.add(card.remove());
		}
		System.out.println(card.remove());
	}
}