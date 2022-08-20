package d4;

import java.util.Scanner;
import java.util.Stack;

public class No_1218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			String input = sc.next();
			boolean result = matchTest(input);
			if (result) {
				System.out.println("#" + tc + " 1");
			} else {
				System.out.println("#" + tc + " 0");
			}
		}
	}

	
	
	// 괄호의 짝이 제대로 연결되어 있는지 확인하는 메소드 선언.
	public static boolean matchTest(String input) {
		int size = input.length();
		if (size <= 1)
			return false;

		Stack<Character> brackets = new Stack<>();
		for (int i = 0; i < size; i++) {
			char temp = input.charAt(i);
			switch (temp) {
			case '(':
			case '{':
			case '[':
			case '<':
				brackets.push(temp);
				break;
			case ')':
				if (brackets.pop() != '(')
					return false;
				break;
			case '}':
				if (brackets.pop() != '{')
					return false;
				break;
			case ']':
				if (brackets.pop() != '[')
					return false;
				break;
			case '>':
				if (brackets.pop() != '<')
					return false;
				break;
			}
		}
		// brackets스택에 값이 남아 있으면 짝 매칭이 끝나지 않은 것이므로 false값 반환.
		if (brackets.isEmpty())
			return true;
		else
			return false;

	}

}