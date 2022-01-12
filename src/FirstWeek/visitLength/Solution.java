package FirstWeek.visitLength;

import java.util.*;
public class Solution {

	public static class Pair<T, S>{
		T i;
		S j;
		public Pair() {

		}
		public void set(T first, S second){
			this.i= first;
			this.j = second;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair<?, ?> other = (Pair<?, ?>) o;
			return	other.i == i && other.j == j;
		}

		@Override
		public int hashCode() {
			return Objects.hash(i, j);
		}
	}

	public class Path{
		private int curI;
		private int curJ;
		private int nI;
		private int nJ;

		public int[] Path(Pair<Integer, Integer> cur, Pair<Integer, Integer> next){
			this.curI = cur.i;
			this.curJ = cur.j;
			this.nI = next.i;
			this.nJ = next.j;
			int[] res = {this.curI, this.curJ, this.nI, this.nJ};
			return res;
		}

		public int[] set(Pair<Integer, Integer> cur, Pair<Integer, Integer> next){
			this.curI = cur.i;
			this.curJ = cur.j;
			this.nI = next.i;
			this.nJ = next.j;
			int[] res = {this.curI, this.curJ, this.nI, this.nJ};
			return res;
		}
	}

	public int solution(String dirs) {
		HashMap<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>, Boolean> pathCheck = new HashMap<>();
		HashMap<Character, Integer> command = new HashMap<>();
		command.put('U', 0);
		command.put('D', 1);
		command.put('R', 2);
		command.put('L', 3);
		Pair<Integer, Integer> point = new Pair<>();
		Pair<Integer , Integer> nextPoint;
		Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> go = new Pair<>();
		Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> back = new Pair<>();
		HashMap<Path, Boolean> testPathCheck = new HashMap<>();

		point.set(5,5);
		int res = 0;
		for(int i = 0; i < dirs.length(); i++){
			int idx = command.get(dirs.charAt(i));
			nextPoint = move(idx, point);
			go.set(point, nextPoint);
			back.set(nextPoint, point);
//			양뱡향 넣기
			if(!(pathCheck).containsKey(go)){
				pathCheck.put(go, false);
			}
			if(!pathCheck.containsKey(back)){
				pathCheck.put(back, false);
			}
			// point 갱신
			point = nextPoint;
		}
		Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> temp = new Pair<>();
		Pair<Integer, Integer> temp1 = new Pair<>();
		Pair<Integer , Integer> temp2 = new Pair<>();
		temp1.set(5,5);
		temp2.set(4,5);
		temp.set(temp1, temp2);
		System.out.println(pathCheck.get(temp));

		return res;
	}
	Pair<Integer, Integer> move(int idx, Pair<Integer, Integer> point){
		Pair<Integer, Integer> pointTemp = new Pair<>();
		pointTemp.set(point.i, point.j);
		// 이동좌표한 좌표를 넘기
		int[] dj = {0,0,1,-1};
		int[] di = {-1,1,0,0};
		// 포인트가 범위를 넘어가면 하지말아야한다 넘어가면 좌표에서 더하지 않는다..
		pointTemp.i += di[idx];
		pointTemp.j += dj[idx];

		// 이전에 움직인 범위에 의해 캐릭터의 위치가 지도를 벗어났을 경우
		if(pointTemp.i < 0 || pointTemp.j < 0 || pointTemp.i > 10 || pointTemp.j > 10){
			// 다시 캐릭터를 전의 위치로 이동
			pointTemp.i -= di[idx];
			pointTemp.j -= dj[idx];
		}
		return pointTemp;
	}

}
