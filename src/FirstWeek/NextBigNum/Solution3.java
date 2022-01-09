package FirstWeek.NextBigNum;
class Solution3 {
    public int solution(int n){
        int res = 0;
        int count = countBin(n);
        for(int i = n + 1; i < 1000001; i++){
            if(countBin(i) == count){
                res = i;
                break;
            }
        }
        return res;
    }
    //최하위 비트만 check
    private int countBin(int n) {
        int count = 0;

        for(int i = n; i  >=  1; i >>= 1){
            if((i & 1) == 1){
                count++;
            }
        }
        return count;
    }
}

