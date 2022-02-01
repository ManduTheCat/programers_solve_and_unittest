package SecondWeek.Develop;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> deployDays = new LinkedList<>();

		for(int i = 0; i < progresses.length; i++){
			int days = 0;
			while(progresses[i] + (speeds[i] * days) <100) {
				days++;
			}
			deployDays.offer(days);
		}
//		System.out.println(deployDays);
		ArrayList<Integer> ansArrList = new ArrayList<>();

		int count = 1;
		int curDay = deployDays.poll();
		while(!deployDays.isEmpty()){
			if(curDay >= deployDays.peek()){
				count++;

			}
			else{
				ansArrList.add(count);
				count = 1;
				curDay = deployDays.peek();
			}
			deployDays.poll();
			if(deployDays.isEmpty()){
				ansArrList.add(count);
			}

		}

		return ansArrList.stream().mapToInt(i ->i).toArray();
	}

}
