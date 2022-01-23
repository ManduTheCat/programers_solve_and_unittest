package SecondWeek.Stock;

import java.util.ArrayList;

public class Solution {
	public int[] solution(int[] price) {
		ArrayList<Integer> ansList  = new ArrayList<>();
		int count;
		for (int i = 0; i < price.length; i++) {
			count= 0;
			for (int j = i + 1; j < price.length; j++) {
				count++;
				if (price[i] > price[j]) {
					break;
				}
			}
			ansList.add(count);
		}
		int[] ans  = ansList.stream().mapToInt(i->i).toArray();
//		System.out.println(Arrays.toString(ans));
		return ans;
	}
}
