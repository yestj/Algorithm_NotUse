package bronze;

import java.util.Scanner;

public class Bronze2_No_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			int floor = N % H;
			int room = (N / H) + 1;
			
			if (N % H == 0) {
				floor = H;
				room -= 1;
			}

			if (room / 10 == 0) {
				System.out.println(floor + "0" + room);
			} else {
				System.out.println(floor + "" + room);
			}
		}

	}

}
