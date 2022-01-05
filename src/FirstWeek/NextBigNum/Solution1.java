package FirstWeek.NextBigNum;
// 모든 변수는 존제이유가 있어야한다.
// 퍼블릭 스테틱 제거
public class Solution1 {
	public int solution(int n){
		int res = 0;
		for(int i = n + 1; i < 1000001; i++){
			if(countBin(i) == countBin(n)){
				res = i;
				break;
			}
		}
		return res;
	}
// 이진으로 처리
	private int countBin(int n) {
		int count = 0;
		for(int i = 1 ; i <= n; i = i << 1){
			if((i & n) == i){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	}
}
