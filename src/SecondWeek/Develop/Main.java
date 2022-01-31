package SecondWeek.Develop;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		int [] p1 = {93, 30, 55};
		int [] p2 = {95, 90, 99, 99, 80, 99};
		int [] p3 = {90, 90};
		int [] s1= {1, 30, 5};
		int [] s2 = {1, 1, 1, 1, 1, 1};
		int [] s3 = {1, 10};

		System.out.println(Arrays.toString(test.solution(p1, s1)));
		System.out.println();
		System.out.println(Arrays.toString(test.solution(p2, s2)));
		System.out.println(Arrays.toString(test.solution(p3, s3))); // 1,1
	}
}
