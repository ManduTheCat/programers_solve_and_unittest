package FirstWeek.EndTalk;

import java.util.HashMap;
public class Solution {
	public int[] solution(int n, String[] words) {
		// 끝말 잇기 검사
		// 단어 끝 다음 앞이 맞는가
		// 중복된 단어를 말하는가 :hashMap
		// 몇벛째 사람이 몇번째에 말한것인가: hashMap;
		// 없으면 [0,0];
		HashMap <String, Integer> worldCount = new HashMap<>();
		HashMap <Integer, Integer> whoSay = new HashMap<>();
		for (String word : words) {
			worldCount.put(word, 0);
		}
		for(int i = 0; i < n; i++){
			whoSay.put(i , 0);
		}
		whoSay.put(0, 1);
		worldCount.put(words[0], worldCount.get(words[0]) + 1);

		char beforeLastChar = getLastChar(words[0]);
		for(int i = 1; i < words.length; i++){
			whoSay.put(i % n ,whoSay.get(i % n) + 1 );
			worldCount.put(words[i], worldCount.get(words[i]) + 1 ); // 계속 2 있는가 검사해서 2가 되면 말한사람 : 몇번째에 말하는가
			if(worldCount.get(words[i]) == 2){
				return new int[]{i % n + 1, whoSay.get(i % n)};
			}
			if(beforeLastChar != getFirstChar(words[i])){
				return new int[]{i %n+1 , whoSay.get(i % n)};
			}
			beforeLastChar = getLastChar(words[i]);
		}
		return new int[]{0,0};
	}
	private char getLastChar(String st){
		return st.charAt(st.length() -1);
	}
	private char getFirstChar(String st){
		return st.charAt(0);
	}
}
