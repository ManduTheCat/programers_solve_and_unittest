package FirstWeek.visitLength;

import java.util.*;
public class Solution {

	int count = 0;
	public int solution(String dirs) {

		HashMap<String, Integer> command = new HashMap<>();
		command.put("U", 0);
		command.put("D", 1);
		command.put("R", 2);
		command.put("L", 3);
		int [][] map = new int [11][11];
//		map[5][5] = 1;
		int [] point = {5,5};
		for(int i = 0; i < dirs.length(); i++){
			//map 을 쓰기 위한 처절한 몸부림
			String c = Character.toString(dirs.charAt(i));
			int idx = command.get(c);
			point = move(idx, point);
			map[point[0]][point[1]] = 1;
		}
		for(var i : map){
			System.out.println(Arrays.toString(i));
		}
		int sum = 0;
		for(var i : map ){
			for(var j : i){
				sum += j;
			}
		}
		System.out.println(count);
		return sum;
	}
	int[] move(int idx, int [] point){
		// 이동좌표한 좌표를 넘기
		int[] dj = {0,0,1,-1};
		int[] di = {-1,1,0,0};
		// 포인트가 범위를 넘어가면 하지말아야한다 넘어가면 좌표에서 더하지 않는다..
		point[0] += di[idx];
		point[1] += dj[idx];
		count++;

		// 이전에 움직인 범위에 의해 캐릭터의 위치가 지도를 벗어났을 경우
		if(point[0] < 0 || point[1] < 0 || point[0] > 10 || point[1] > 10){
			// 다시 캐릭터를 전의 위치로 이동
			point[0] -= di[idx];
			point[1] -= dj[idx];
			count--;
		}


		return point;
	}
}
