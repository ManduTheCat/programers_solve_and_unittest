package SecondWeek.RightBrackeet;

public class Solution2 {
//	스택을 안쓰고도 풀어보시겠어요?
	boolean solution(String s) {
		int bracketCount = 0;
		for(var c : s.toCharArray()){
			if(c ==  '('){
				bracketCount++;
			}
			else if(c == ')' && bracketCount > 0) {
				bracketCount--;
			}
			else{
				return false;
			}

		}
		return bracketCount == 0;
	}
}
