package silver;

import java.util.Scanner;

public class Silver4_No_10158 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		int t = sc.nextInt();
		
		x = (x+t) % (2*w);
		y = (y+t) % (2*h);
		
		if(x > w) {
			x = 2*w - x;
		}
		if(y > h) {
			y = 2*h - y;
		}
		
		System.out.println(x + " " + y);

	}

}
