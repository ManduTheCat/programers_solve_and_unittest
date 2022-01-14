package FirstWeek.visitLength;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Solution1 {

	public class Pair<T, S>{
		T i;
		S j;
		public Pair() {

		}
		public void set(T first, S second){
			this.i= first;
			this.j = second;
		}
	}

	public static class Path{
		private int curI;
		private int curJ;
		private int nI;
		private int nJ;
		public int[] pathArr;

		public Path(Pair<Integer, Integer> cur, Pair<Integer, Integer> next){
			this.curI = cur.i;
			this.curJ = cur.j;
			this.nI = next.i;
			this.nJ = next.j;
			this.pathArr = new int[]{cur.i, cur.j, next.i, next.j};
		}


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Path path = (Path) o;
			return curI == path.curI && curJ == path.curJ && nI == path.nI && nJ == path.nJ ;
		}

		@Override
		public int hashCode() {
			return Objects.hash(curI, curJ, nI, nJ);
		}
	}

	public int solution(String dirs) {
		HashMap<Character, Integer> command = new HashMap<>();
		command.put('U', 0);
		command.put('D', 1);
		command.put('R', 2);
		command.put('L', 3);
		Pair<Integer, Integer> point = new Pair<>();
		Pair<Integer , Integer> nextPoint;
		HashMap<Path, Boolean> pathCheck = new HashMap<>();

		point.set(5,5);
		for(int i = 0; i < dirs.length(); i++){
			int idx = command.get(dirs.charAt(i));
			nextPoint = move(idx, point);
			Path go = new Path(point, nextPoint);
			Path back = new Path(nextPoint, point);

			// 가는 경로 오는 경로 false로 초기화
			pathCheck.put(go, false);
			pathCheck.put(back , false);
			// point 갱신
			point = nextPoint;
		}

		point.set(5,5);
		int pathCount = 0;
		for(int i = 0; i < dirs.length(); i++){
			int idx = command.get(dirs.charAt(i));
			nextPoint = move(idx, point);
			Path go = new Path(point, nextPoint);
			Path back = new Path(nextPoint, point);

			// 입력된 명령되로 진행되면서 pathCheck(좌표 , false) true 로 변환 경로 갯수를 센다.
			if(!pathCheck.get(go) && !pathCheck.get(back)){
				pathCheck.put(go, true);
				pathCheck.put(back,true);
				pathCount++;


				// 경로가 범위를 넘어서면 point = nextPoint 부분 때문에 같은 좌표를 반복 하여 카운트가 올라간다 이를 처리
//				System.out.println(Arrays.toString(go.pathArr)+" "+ + " " +Arrays.toString(back.pathArr));
				if((go.curI == back.curI) && (go.curJ == back.curJ) && (go.nI == back.nI) && (go.nJ == back.nJ)) {
					System.out.println(Arrays.toString(go.pathArr) + " " +Arrays.toString(back.pathArr));
					pathCount--;
				}
			}
			point = nextPoint;
		}
		return pathCount;
	}
	Pair<Integer, Integer> move(int idx, Pair<Integer, Integer> point){
		Pair<Integer, Integer> pointTemp = new Pair<>();
		pointTemp.set(point.i, point.j);
		int[] dj = {0,0,1,-1};
		int[] di = {-1,1,0,0};

		// 이전에 움직인 범위에 의해 캐릭터의 위치가 지도를 벗어나지 않는경우
		if(!(pointTemp.i + di[idx] < 0 || pointTemp.j + dj[idx] < 0 || pointTemp.i+ di[idx] > 10 || pointTemp.j+dj[idx] > 10)){
			// 이동한다
			pointTemp.i += di[idx];
			pointTemp.j += dj[idx];
			return pointTemp;
		}
		// 아니면 원래 좌표를 리턴한다.
		return pointTemp;
	}

}

