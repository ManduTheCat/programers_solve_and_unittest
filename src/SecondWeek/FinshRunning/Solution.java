package SecondWeek.FinshRunning;

import java.util.HashMap;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String s: participant) {
			if(map.containsKey(s)){
				map.put(s, map.get(s) + 1);
			}
			else {
				map.put(s, 1);
			}
		}

		for (String s : completion) {
				map.put(s, map.get(s) - 1);
		}

		for (String key : map.keySet()) {
			int value = map.get(key);
			if (value == 1) {
				return key;
			}
		}
		return " ";
	}
}
