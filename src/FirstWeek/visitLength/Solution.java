package FirstWeek.visitLength;

public class Solution {
	public int solution(String dirs) {
		System.out.println(dirs);
		int answer = 0;
		int [][] map = new int [10][10];
		map[4][4] = 9;
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		return answer;
	}
}
