package FirstWeek.mockExam;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int[] solution(int[] answers) {
		int []answer = {};
		int []p1 = {1, 2, 3, 4, 5};
		int []p2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int []p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		for(int i = 0; i < answers.length; i++){
			System.out.println(p1[ i % p1.length]);
		}
		return answer;
	}


}
