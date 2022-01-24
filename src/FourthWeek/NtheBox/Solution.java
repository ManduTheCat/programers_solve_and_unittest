package FourthWeek.NtheBox;

public class Solution {
	int div = 1000000007;
	int[] m = new int[60000];
	public int solution(int n ){
		/*
		 n번쨰에 올수 있는 경우의 수 dp(n)
		 dp(1) = 1, dp(2) = 2, dp(3) = 3
		 마지막에 1 * 2 가 오는경우 2* 1이 오는 경우로 나눌 수 있다.
		 top down 방식 + 메모이제이션 으로 풀어보자
		*/
		m[1] = 1 % div;
		m[2] = 2 % div;
		return dp(n) % div;
	}
	private int dp(int n){
		if(m[n] != 0){
			return m[n] % div;
		}
		m[n] = dp(n -1) + dp(n -2);
		return m[n] % div ;
	}
}
