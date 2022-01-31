package FourthWeek.TargeNum;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		int [] intpu1 = {1, 1, 1, 1, 1};
		int [] intpu2 = {4, 1, 2, 1};
		int target2 = 4;
		int target1 = 3;
		//5
		System.out.println(test.solution(intpu1, target1));
		//2
		System.out.println(test.solution(intpu2, target2));
	}
}
