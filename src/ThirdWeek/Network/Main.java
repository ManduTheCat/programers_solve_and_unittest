package ThirdWeek.Network;

public class Main {
	public static void main(String[] args) {
		SolutionBFS test = new SolutionBFS();
		int [][] input1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int n1 = 3;
		int [][] input2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		int n2 = 3;
		test.solution(n1, input1);
		test.solution(n2, input2);
	}
}
