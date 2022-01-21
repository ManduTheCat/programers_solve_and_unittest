package ThirdWeek.Network;

public class Solution1 {
	boolean[] check = new boolean[201];
	public int solution(int n , int [][] computers) {
		//한번 갔던 곳은 가지 않는다.
		// check 는 노드 방문 확인
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				bfs(computers, i);
				ans++;
			}
		}
		return ans;
	}

	private void bfs(int [][] com, int node){
		check[node] = true;
		for(int nexNode = 0; nexNode < com[node].length; nexNode++){
			if( com[node][nexNode] ==1 && !check[nexNode] && node != nexNode){
				bfs(com, nexNode);
			}
		}
	}
}
