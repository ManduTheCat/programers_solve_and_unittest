package FourthWeek.GymSuit;

import java.util.*;

public class Solution {

	public int solution(int n, int[] lost, int[] reserve) {
		HashMap <Integer, Integer> suitCount = new HashMap<>();
		for(int i = 1; i <= n ;  i++){
			suitCount.put(i, 1);
		}
		for(int r : reserve){
			suitCount.put(r, 2);
		}
		for(int l : lost){
			suitCount.put(l, suitCount.get(l) - 1);
		}

		int count = 0;
		ArrayList<Integer> newReserve = new ArrayList<>();
		ArrayList<Integer> newLost = new ArrayList<>();
		for(var k : suitCount.keySet()){
			if(suitCount.get(k)  > 0){
				count ++;
			}
			if(suitCount.get(k) == 2){
				newReserve.add(k);
			}
			if(suitCount.get(k) == 0){
				newLost.add(k);
			}
		}
		Collections.sort(newReserve);
		HashSet<Integer> reserveQ = new HashSet<>(newReserve);
		Collections.sort(newLost);
		Queue<Integer> lostQ = new LinkedList<>(newLost);
		System.out.println("reserve "+reserveQ+" lost "+ lostQ);
//		System.out.println(suitCount+ " " + count);
		return give(lostQ, reserveQ, count);
	}
	private int give(Queue <Integer>lostQ, HashSet<Integer> reserve, int count ){
		// 3가지 변경
		// 1은 앞 숫자 일때 2는 뒷수자일때;
		int count1 = count;
		int count2 = count;
		HashSet <Integer> reserveForCount1 = new HashSet<>(reserve);
		HashSet <Integer> reserveForCount2 = new HashSet<>(reserve);
		Queue<Integer> lostQForCount1 = new LinkedList<>(lostQ);
		Queue<Integer> lostQForCount2 = new LinkedList<>(lostQ);
		if(lostQ.isEmpty()){
			return count;
		}
		if(reserve.contains(lostQ.peek() + 1)){
			reserveForCount1.remove(lostQ.peek()+ 1);
			if(!lostQForCount1.isEmpty()) {
				lostQForCount1.poll();
//				System.out.println(" ...+ "+ lostQForCount1 + " " + " " + reserveForCount1 + " " + count1);
				count1 = give(lostQForCount1, reserveForCount1, count)+1;

			}
		}
//		if(lostQ.isEmpty()){
//			return count2;
//		}
		if(reserve.contains(lostQ.peek() -1)){
			reserveForCount2.remove(lostQ.peek() -1 );
			if(!lostQForCount2.isEmpty()) {
				lostQForCount2.poll();
//				System.out.println(" -... "+ lostQForCount2 + " " + " " + reserveForCount2 + " " + count2);

				count2 = give(lostQForCount2, reserveForCount2, count)+1;

			}
		}

//		System.out.println(reserve);
//		System.out.println(lostQ);
//		System.out.println("compare with [" + count1 +", "+ count2+"]");
		return Math.max(count1,count2);
	}

}
