package d3;

import java.util.Scanner;

public class No_1873 {
	
	// 현재의 방향을 가리킬 idx 선언.
	static int drIdx = -1;
	static int dcIdx = -1;
	
	static char[][] map;

	static int H;
	static int W;

	static int currR = -1;
	static int currC = -1;

	// Up, Down, Left, Right 방향 설정을 위한 배열 선언.
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			H = sc.nextInt();
			W = sc.nextInt();

			map = new char[H][W];
			drIdx = -1;
			dcIdx = -1;

			for (int r = 0; r < H; r++) {
				String input = sc.next();
				for (int c = 0; c < W; c++) {
					map[r][c] = input.charAt(c);
					if (map[r][c] == '^' || map[r][c] == 'v' || map[r][c] == '>' || map[r][c] == '<') {
						currR = r;
						currC = c;
						setDirection(map[r][c]);
					}
				}
			}

			int cmdNum = sc.nextInt();
			char[] cmd = new char[cmdNum];
			String input = sc.next();
			for (int i = 0; i < cmdNum; i++) {
				cmd[i] = input.charAt(i);
			}

			for (char x : cmd) {
				switch (x) {
				case 'U':
					map[currR][currC] = '^';
					setDirection(map[currR][currC]);
					move();
					break;
				case 'D':
					map[currR][currC] = 'v';
					setDirection(map[currR][currC]);
					move();
					break;
				case 'L':
					map[currR][currC] = '<';
					setDirection(map[currR][currC]);
					move();
					break;
				case 'R':
					map[currR][currC] = '>';
					setDirection(map[currR][currC]);
					move();
					break;
				case 'S':
					shoot();
					break;
				}
			}

			StringBuilder result = new StringBuilder();
			result.append("#"+tc+" ");
			for(int r = 0; r < H; r++) {
				for(int c = 0; c < W; c++) {
					result.append(map[r][c]);
				}
				result.append("\n");
			}
			System.out.print(result.toString());
		}

	}

	static void setDirection(char car) {

		switch (car) {
		case '^':
			drIdx = 0;
			dcIdx = 0;
			break;
		case 'v':
			drIdx = 1;
			dcIdx = 1;
			break;
		case '<':
			drIdx = 2;
			dcIdx = 2;
			break;
		case '>':
			drIdx = 3;
			dcIdx = 3;
			break;
		}

	}

	static void move() {
		int row = currR + dr[drIdx];
		int col = currC + dc[dcIdx];

		if (row >= 0 && row < H && col >= 0 && col < W && map[row][col] == '.') {
			map[row][col] = map[currR][currC];
			map[currR][currC] = '.';
			currR = row;
			currC = col;
		}

	}

	static void shoot() {

		int row = currR + dr[drIdx];
		int col = currC + dc[dcIdx];
		while (row >= 0 && row < H && col >= 0 && col < W && map[row][col] != '#') {
			if (map[row][col] == '*') {
				map[row][col] = '.';
				break;
			}
			row += dr[drIdx];
			col += dc[dcIdx];
		}

	}

}
