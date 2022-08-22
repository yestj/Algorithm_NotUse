package silver;

import java.util.Scanner;
import java.util.Stack;

public class Silver4_No_9012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {
			String input = sc.next();
			int size = input.length();
			
			Stack<Character> brackets = new Stack<>();
			
			boolean flag = true;
			for(int i = 0; i < size; i++) {
				char temp = input.charAt(i);
				if(temp == '(') {
					brackets.push(temp);
				} else {
					// ')'을 만나면 스택이 비어있지 않았을 경우, '('을 pop.
					if(!brackets.isEmpty())
						brackets.pop();
					else {
					// 스택이 비어 있을 경우, 테스트가 실패했음을 반환.
						flag = false;
						break;
					}
				}
			}
			
			// 스택이 비어 있고, 테스트가 성공적으로 끝났을 경우.
			if (brackets.isEmpty() && flag) System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
