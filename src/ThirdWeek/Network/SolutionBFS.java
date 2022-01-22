package ThirdWeek.Network;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBFS {

	public int solution(int n, int[][]computers){
		boolean[] pathCheck = new boolean[n];
		int count = 0;
		for(int i = 0; i< n; i++){
			if (!pathCheck[i]) {
				bfs(i, computers, pathCheck);
				count++;
			}
		}

		return count;
	}

	private void bfs(int node, int [][] com, boolean[] pathCheck){
		Queue<Integer> q = new LinkedList<>();
		pathCheck[node] = true;
		q.add(node);
		while(!q.isEmpty()){
			int curNode = q.peek();
			q.poll();
			for(int i = 0; i < com[curNode].length; i++){
				if(!pathCheck[i] && curNode != i && com[curNode][i]==1){
					pathCheck[i] = true;
					q.add(i);
				}
			}

		}
	}
}


