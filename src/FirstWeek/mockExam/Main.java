package FirstWeek.mockExam;
class Main {
	public static void main(String[] args) {
		FirstWeek.mockExam.Solution test = new FirstWeek.mockExam.Solution();
		int [] input1 = {1,2,3,4,5};
		int [] input2 = {1,3,2,4,2};
		int [] input3 = {1};
		for(int i : test.solution(input1)){
			System.out.print(i);
		}

		System.out.println();
		for(int i : test.solution(input2)){
			System.out.print(i);
		}
		System.out.println();
		for(int i : test.solution(input3)){
			System.out.print(i);
		}
		System.out.println("\n");

	FirstWeek.mockExam.Solution2 test1 = new Solution2();
		test1.solution(input1);
		test1.solution(input2);
		test1.solution(input3);
	}
}