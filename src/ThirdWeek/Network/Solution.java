package ThirdWeek.Network;

public class Solution {

	public int solution(int n, int[][] computers) {
		int ans = 0;
		boolean[] check = new boolean [n];
		for(int i = 0; i < n; i++){
			if(!check[i]){
				dfs(computers, check, i);
				ans++;
			}
		}
		return ans;
	}
	private boolean[] dfs (int[][] com, boolean[] check, int i ){
		check[i] = true;
		for(int j =0;  j < com.length; j++){
			if(i != j && !check[j] &&  com[i][j] == 1){
				check = dfs(com, check, j);
			}
		}
		return check;
	}
}
