package FirstWeek.NextBigNum;
class Solution {

	public static int solution(int n){
		int count = countBin(n);
		int nextCount = 0;
		for(int i = n + 1; i < 1000001; i++){
			nextCount = countBin(i);
			if(nextCount == count){
				return i;
			}
		}
		return nextCount;
	}

	public	static int countBin(int n) {
		int count = 0;
		while(n > 0){
			if(n%2 == 1){
				count++;
			}
			n /= 2;
		}
		return count;
	}
	public static void main(String[] args) {
		solution(15);
	}
}
