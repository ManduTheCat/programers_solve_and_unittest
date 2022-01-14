package FirstWeek.EndTalk;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		int n1 = 3;
		String[] w1 = new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int [] res1 = new int[] {3,3};

		int n2 = 3;
		String[] w2 = new String[]{"hello", "observe", "effect", "take", "either",
				"recognize", "encourage", "ensure", "establish", "hang", "gather", "refer",
				"reference", "estimate", "executive"};
		int [] res2  = new  int[] {0,0};

		int n3 =  2 ;
		String[] w3 = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
		int [] res = new int[]{1, 3};

		test.solution(n1 , w1);
//		test.solution(n2 , w2);
		test.solution(n3 , w3);
	}
}
