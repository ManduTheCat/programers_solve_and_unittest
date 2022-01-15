package ThirdWeek.MoreHot;

import java.util.PriorityQueue;

public class Solution {
	//최대 1000000 - 1 만큼 반복한다..
	// 스코빌 지수를 구하면서계속  sorting 하여 최소값을 가져와야한다  이와 동시에 삽입이 일어난다 최대 1000,000번
	// arrayList 는 너무 시간복잡도가 크다!!
	// 삽입 비용이 nLogn 인 최소 최소힙을 사용
	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(var i :scoville){
			pq.add(i);
		}
		int count = 0;
		while (pq.peek() < K){
			if(pq.size() < 2) {
				return -1;
			}
				int min = pq.poll();
				int secMin = pq.poll();
				pq.add( min + (secMin * 2));
				count++;
		}

		return count;
	}
}
