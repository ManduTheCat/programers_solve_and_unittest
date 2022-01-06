package FirstWeek.mockExam;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int[] solution(int[] answers) {
		ArrayList <Integer> count = new ArrayList<>();
		ArrayList <Integer> testerOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList <Integer> testerSecond = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
		ArrayList <Integer> testerThird = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
		ArrayList <Integer> ans= new ArrayList<>(Arrays.asList(Arrays.stream(answers).
				boxed().
				toArray(Integer[]::new)));
		count.add(compare(ans, testerOne));
		count.add(compare(ans, testerSecond));
		count.add(compare(ans, testerThird));
		int maxIndex = maxIndex(count);
//		System.out.println(maxIndex+" "+count.get(maxIndex));
//		최대값을 다 가지고있는 인덱스를 검사한다 리턴은 answer
		ArrayList ansList = checkMax(count, maxIndex);
		int []answer = ansList.stream().mapToInt(i -> (int) i + 1).toArray();
		return answer;
	}

		private ArrayList<Integer> checkMax(ArrayList<Integer>count, int maxIndex){
			int maxNum = count.get(maxIndex);
			ArrayList<Integer> res = new ArrayList<>();
			for(int i = 0; i < count.size(); i++){
				if(maxNum == count.get(i)){
					res.add(i);
				}
			}
			return res;
		}

		private int compare(ArrayList<Integer>src, ArrayList<Integer>dest){
			int count = 0;
			for(int i = 0; i < src.size(); i++){
				if(src.get(i).equals(dest.get(i))){
					count++;
				}
			}
			return count;
		}
		private int maxIndex (ArrayList<Integer> count){
			int max = 0;
			int index = 0;
			for(int i = 0; i < count.size(); i++){
				if(count.get(i) > max){
					max = count.get(i);
					index = i;
				}
			}
			return index;
		}


}
