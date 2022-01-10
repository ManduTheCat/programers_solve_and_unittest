package SecondWeek.FinshRunning;

public class Main {
	public static void main(String[] args) {
		Solution test = new Solution();
		String []par = {"leo", "kiki", "eden"};
		String []com = {"eden", "kiki"};
		String []par1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String []com1 = {"josipa", "filipa", "marina", "nikola"};
		String []par2 = {"mislav", "stanko", "mislav", "ana"};
		String []com2 = {"stanko", "ana", "mislav"};

		test.solution(par2, com2);
		test.solution(par1, com1);
		test.solution(par, com);
	}
}
