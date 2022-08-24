package bronze;

import java.util.Scanner;

public class Bronze2_No_2920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] note = new int[8];
		for (int i = 0; i < 8; i++) {
			note[i] = sc.nextInt();
		}

		boolean flag = true;
		if (note[0] < note[1]) {
			for (int i = 2; i < 8; i++) {
				if (note[i - 1] > note[i]) {
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("ascending");
			else System.out.println("mixed");
		} else {
			for (int i = 2; i < 8; i++) {
				{
					if (note[i - 1] < note[i]) {
						flag = false;
						break;

					}
				}
			}
			if(flag) System.out.println("descending");
			else System.out.println("mixed");
		}
	}

}
