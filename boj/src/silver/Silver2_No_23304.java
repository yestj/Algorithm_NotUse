package silver;

import java.util.Scanner;

public class Silver2_No_23304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		boolean result = false;

		// 1. 회문 검사 (전체를 거꾸로 읽어도 똑같은지)
		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();
		if (!input.equals(reverse)) {
			result = false;
		} else {
			result = isPalindrome(input);
		}

		if (result) {
			System.out.println("AKARAKA");
		} else {
			System.out.println("IPSELENTI");
		}

	}

	static boolean isPalindrome(String input) {
		int size = input.length();

		// 인풋의 사이즈가 1이면 true 반환.
		if (size == 1)
			return true;

		// 2. 중앙 값을 기준으로 나누어 앞뒤가 같은지 확인
		String front = input.substring(0, size / 2);
		String back = "";
		if (size % 2 == 0) {
			back = input.substring(size / 2, size);
		} else {
			back = input.substring((size / 2) + 1, size);
		}

		if (front.equals(back)) {
			// return을 해줘야 함..! 재귀! 
			return isPalindrome(input.substring(0, size / 2));
		} else {
			return false;
		}
	}

}
