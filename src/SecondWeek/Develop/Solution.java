package SecondWeek.Develop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> p = new LinkedList<>();
		Queue<Integer> s = new LinkedList<>();
		HashMap<Integer, Integer> count = new HashMap<>();
		// 다음 작업이 더빨리 끝난다면? 이코드는?
		for(var input: progresses){
			p.offer(input);
		}
		for(var input : speeds){
			s.offer(input);
		}

		int days = 0;
		while(!p.isEmpty()){

			int curP = p.poll();
			int curS = s.poll();
			while(curP + (days * curS) < 100){
				curP += days * curS;
				days++;
			}

			if(count.containsKey(days)){
				count.put(days, count.get(days)+1);
			}
			else{
				count.put(days, 1);
			}
		}
//		System.out.println(count);
		ArrayList<Integer> ans = new ArrayList<>();
			for (var key : count.keySet()) {
				ans.add(count.get(key));
			}

		return ans.stream().mapToInt(i -> i).toArray();
	}
}
