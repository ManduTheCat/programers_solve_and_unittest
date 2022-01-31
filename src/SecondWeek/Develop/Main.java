package SecondWeek.Develop;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		int [] p1 = {93, 30, 55};
		int [] p2 = {95, 90, 99, 99, 80, 99};
		int [] s1= {1, 30, 5};
		int [] s2 = {1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(test.solution(p1, s1)));
		System.out.println();
		test.solution(p2, s2);
	}
}
