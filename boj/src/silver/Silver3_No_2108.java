package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Silver3_No_2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Integer[] nums = new Integer[N];

		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		// 1. 산술평균 출력
		double sum = 0;
		for (int x : nums)
			sum += x;
		int avg = (int) (Math.round(sum / N));

		// 2. 중앙값 출력
		Arrays.sort(nums);
		int mid = nums[N / 2];

		// 3. 최빈값 출력
		// nums 배열을 돌며, 해당 값이 몇 번 나오는지 카운팅해주기.
		int[][] freqArr = new int[N][2];
		freqArr[0][0] = nums[0];
		freqArr[0][1] = 1;
		int idx = 0;
		// 카운팅 횟수의 최댓값 저장하기.
		int max = 1;
		
		// 여기서 equals가 아닌 단순 == 비교를 할 경우, 마지막 부분에서 값이 같더라도 false가 산출된다.. 왜일까?
		for (int i = 1; i < N; i++) {
			if (nums[i].equals(nums[i - 1])) {
				freqArr[idx][1]++;
			} else {
				freqArr[++idx][0] = nums[i];
				freqArr[idx][1]++;
			}
			if (freqArr[idx][1] > max)
				max = freqArr[idx][1];
		}
		
		// 최대 카운팅횟수값을 배열[1]에 저장하고 있는 값들을 modeList에 모두 저장.
		ArrayList<Integer> modeList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (freqArr[i][1] == max) {
				modeList.add(freqArr[i][0]);
			}
		}

		int mode = 0;
		// modeList를 돌며 값이 2개 이상일 경우에는 두번째로 작은 값 출력.
		for (int i = 0; i < modeList.size(); i++) {
		}
		if (modeList.size() == 1) {
			mode = modeList.get(0);
		} else {
			mode = modeList.get(1);
		}

		// 범위 출력(최대, 최솟값의 차이)
		int range = nums[N - 1] - nums[0];

		System.out.println(avg);
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(range);

	}
}
