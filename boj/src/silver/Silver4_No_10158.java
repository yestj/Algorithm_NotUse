package silver;

import java.util.Scanner;

public class Silver4_No_10158 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] dx = {1, -1};
		int[] dy = {1, -1};
		int idxX = 0;
		int idxY = 0;
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			x += dx[idxX];
			y += dx[idxY];
			if(x == 0 || x == w) {
				idxX = 1- idxX;
			}
			if(y == 0 || y == h) {
				idxY = 1-idxY;
			}
		}
		
		System.out.println(x + " " + y);

	}

}
