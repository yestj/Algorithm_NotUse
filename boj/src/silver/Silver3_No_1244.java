package silver;

import java.util.Scanner;

public class Silver3_No_1244 {
	// 스위치를 켜고 끄는 메소드 선언.
	static void switchesOnOff(int[] arr, int idx) {
		if (arr[idx] == 0) arr[idx] =1;
		else arr[idx] = 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 스위치의 개수와 현재 상태 입력 받기.
		int N = sc.nextInt();
		int[] switches = new int[N];
		for(int i = 0; i < N; i++) {
			switches[i] = sc.nextInt();
		}
		
		// 학생 수 입력 받기.
		int Stu = sc.nextInt();
		for(int i = 0; i < Stu; i++) {
			int gender = sc.nextInt();
			switch(gender) {
			// 남자일 경우, 배수에 해당하는 인덱스들의 스위치 변경.
			// 이 때, 지문은 스위치 위치가 1번째부터 시작하므로 인덱스 숫자 조정.
			case 1:
				int mIdx = sc.nextInt();
				for(int j = 1; j <= (N/mIdx); j++) {
					switchesOnOff(switches, (j*mIdx)-1);
				}
				break;
			// 여자일 경우, start, end포인트를 잡아줘서 이들이 index를 벗어나지 않고, 서로 같을 때만 스위치 변경.
			case 2:
				int wIdx = sc.nextInt()-1;
				switchesOnOff(switches, wIdx);
				int start = wIdx-1;
				int end = wIdx+1;
				while(start >= 0 && end <= N-1 && switches[start]==switches[end]) {
					switchesOnOff(switches, start--);
					switchesOnOff(switches, end++);
				}
			}
		}
		
		for(int i = 0; i < N; i ++) {
			System.out.print(switches[i] + " ");
			if(i % 20 == 19) System.out.println();
		}

	}
	

}
