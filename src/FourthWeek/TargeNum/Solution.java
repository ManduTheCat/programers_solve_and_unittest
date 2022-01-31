package FourthWeek.TargeNum;


public class Solution {

	public int solution(int[] numbers, int target) {
		return dfs(numbers, 0, 0, target);
	}

	private int dfs (int []numbers, int index, int sum, int target){
		// 끝에 도달하면 검사하고 다시 리턴한다.
		if(index == numbers.length){
			if(target == sum){
				return 1;
			}
			return 0;
		}
		// 두개로 갈린다
		return dfs(numbers, index +1, sum + numbers[index], target)
				+ dfs(numbers, index +1, sum - numbers[index], target);
	}
}

