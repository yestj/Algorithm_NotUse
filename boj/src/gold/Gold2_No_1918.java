package gold;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Gold2_No_1918 {

	public static void main(String[] args) {

		// 연산자 값과 우선순위 설정.
		HashMap<Character, Integer> opPry = new HashMap<>();
		opPry.put(')', 1);
		opPry.put('(', 1);
		opPry.put('+', 2);
		opPry.put('-', 2);
		opPry.put('*', 3);
		opPry.put('/', 3);

		// 연산자를 담을 스택 선언.
		Stack<Character> op = new Stack<>();

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size = input.length();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < size; i++) {
			char temp = input.charAt(i);
			// 1. 연산자가 아닐 경우(문자일 경우) 입력 값에 바로 추가.
			if (!opPry.containsKey(temp)) {
				result.append(temp);
			// 2. '(' 연산자거나 연산자 스택이 비어 있으면 연산자 스택에 바로 추가.
			} else if (temp == '(' || op.isEmpty()) {
				op.push(temp);
			// 3. ')'을 만나면, '('을 만날 때까지 연산자를 꺼내주고, 마지막에 '(' 스택에서 지워주기.
			} else if (temp == ')') {
				while (op.peek() != '(') {
					result.append(op.pop());
				}
				op.pop();
			// 4. 우선순위가 더 높은 연산자를 만날 경우, 스택에 바로 추가. 
			} else if (opPry.get(temp) > opPry.get(op.peek())) {
				op.push(temp);
			// 5. 우선순위가 같은 연산자를 만날 경우, 스택에서 값을 하나 꺼내고 자신을 넣어줌.
			} else if (opPry.get(temp) == opPry.get(op.peek())) {
				result.append(op.pop());
				op.push(temp);
			// 6. 우선순위가 낮은 연산자를 만날 경우, 스택에서 값을 빼줌.
			// 빼고 나서의 연산자가 temp의 우선순위와 같을 경우, 5의 작업을 한 번 해줌.
			// 비어있거나, '('가 저장되어 있는 경우는 해당 연산 없이 진행.
			// 마지막으로 입력값을 스택에 저장해주기.
			} else if (opPry.get(temp) < opPry.get(op.peek())) {
				result.append(op.pop());
				if (!op.isEmpty() && opPry.get(temp) == opPry.get(op.peek())) {
					result.append(op.pop());
				}
				op.push(temp);
			}
		}
		// 스택에 있는 나머지 연산자 모두 출력하기.
		while (!op.isEmpty()) {
			result.append(op.pop());
		}

		System.out.println(result);
	}

}
