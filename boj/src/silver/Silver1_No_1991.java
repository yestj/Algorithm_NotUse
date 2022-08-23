package silver;

import java.util.Scanner;

public class Silver1_No_1991 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Node[] nodeArr = new Node[N];
		char value = 'A';

		for (int i = 0; i < N; i++) {
			nodeArr[i] = new Node(value++);
		}

		for (int i = 0; i < N; i++) {
			int idx = sc.next().charAt(0) - 65;
			char temp = sc.next().charAt(0);
			if (temp != '.') {
				nodeArr[idx].left = nodeArr[temp - 65];
			}
			temp = sc.next().charAt(0);
			if (N > 1 && temp != '.') {
				nodeArr[idx].right = nodeArr[temp - 65];
			}
		}

		System.out.println(preOrder(nodeArr[0]));
		System.out.println(inOrder(nodeArr[0]));
		System.out.println(postOrder(nodeArr[0]));
	}

	// 노드 만들기.
	static public class Node {
		char data;
		Node left;
		Node right;

		public Node(char data) {
			this.data = data;
		}

		public String toString() {
			return data + " ";
		}

	}

	// 1. 전위 순회 (본, 좌, 우)
	public static String preOrder(Node node) {
		String result = "";
		result += node.data;
		if (node.left != null)
			result += preOrder(node.left);
		if (node.right != null)
			result += preOrder(node.right);
		return result;
	}

	// 2. 중위 순회 (좌, 본, 우)
	public static String inOrder(Node node) {
		String result = "";
		if (node.left != null)
			result += inOrder(node.left);
		result += node.data;
		if (node.right != null)
			result += inOrder(node.right);
		return result;
	}

	// 3. 후위 순회 (좌, 우, 본)
	public static String postOrder(Node node) {
		String result = "";
		if (node.left != null)
			result += postOrder(node.left);
		if (node.right != null)
			result += postOrder(node.right);
		result += node.data;
		return result;
	}

}