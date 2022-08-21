package silver;

import java.util.Scanner;
import java.util.Stack;

public class Silver4_No_10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			String cmd = sc.next();
			switch(cmd) {
			case "push":
				st.push(sc.nextInt());
				break;
			case "pop":
				if(st.isEmpty()) result.append("-1" +"\n");
				else result.append(st.pop() + "\n");
				break;
			case "size":
				result.append(st.size() + "\n");
				break;
			case "empty":
				if(st.isEmpty()) result.append("1" +"\n");
				else result.append("0"+"\n");
				break;
			case "top":
				if(st.isEmpty()) result.append("-1" + "\n");
				else result.append(st.peek() + "\n");
			}
		}
		
		System.out.println(result.toString());

	}

}
