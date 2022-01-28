package FourthWeek.TargeNum;

import java.util.Arrays;
import java.util.ArrayList;

public class Solution {

	public int solution(int[] numbers, int target) {
	// 모든 수는 연산을 무조건 해야한다 dfs?
		ArrayList<ArrayList<Integer>> numSum = new ArrayList<>();
		int [][] numbersArr = new int[numbers.length][2];
		for(int i = 0; i < numbers.length; i++){
			numbersArr[i][0] = numbers[i];
			numbersArr[i][1] = numbers[i] * -1;
		}
		// 초기값 지정 해야한다.


		return 0;
	}
}

