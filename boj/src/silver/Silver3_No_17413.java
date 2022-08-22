package silver;

import java.util.Scanner;

public class Silver3_No_17413 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int size = input.length();

		// false일 경우, < > 안에 있는 것으로 간주하여 안에 있는 공백에 대해서는 코드 실행하지 않음.
		boolean flag = true;

		// 결과 값을 저장할 StringBuilder 선언.
		StringBuilder result = new StringBuilder();

		// 문자열을 검색하면서 substring을 이용해 끊어서 StringBuilder에 append할 수 있도록 idx 지정.
		int startIdx = 0;
		int endIdx = -1;

		// 문자열의 char하나하나를 검사하며 테스트 수행.
		for (int i = 0; i < size; i++) {
			char temp = input.charAt(i);
			// '<' 을 만날 경우, 처음에 있는 '<'이 아니라면 앞에 있는 일반 문자열을 뒤집어줘야 함.
			if (temp == '<') {
				if (i != 0) {
					endIdx = i;
					StringBuffer sb = new StringBuffer(input.substring(startIdx, endIdx));
					result.append(sb.reverse());
				}
				// '<'안에 있는 문자열들은 뒤집기를 하지 않을 것이므로 false값으로 변환.
				flag = false;
				startIdx = i;
				continue;
				// '>' 을 만나면 endIdx 지정해주고, < >사이에 있는 모든 문자열을 result에 append.
				// flag는 true로 변경.
			} else if (temp == '>') {
				endIdx = i + 1;
				result.append(input.substring(startIdx, endIdx));
				flag = true;
				startIdx = i + 1;
				// flag가 true이고 공백을 만나면, endIdx로 끊어주고 문자열을 뒤집어 결과값에 append.
			} else if (flag && temp == ' ') {
				endIdx = i;
				StringBuffer sb = new StringBuffer(input.substring(startIdx, endIdx));
				result.append(sb.reverse() + " ");
				startIdx = i + 1;
				// 인덱스가 맨 끝까지 도달했을 경우, 공백이 별도로 없으므로 문자열을 뒤집어 결과값에 append.
			} else if (i == size - 1 && flag) {
				endIdx = i + 1;
				StringBuffer sb = new StringBuffer(input.substring(startIdx, endIdx));
				result.append(sb.reverse() + " ");
				// '<', '>', ' '이 아닐 경우에는 아무런 코드 실행 없이 패스.
			} else {
				continue;
			}

		}

		System.out.println(result.toString());

	}

}
