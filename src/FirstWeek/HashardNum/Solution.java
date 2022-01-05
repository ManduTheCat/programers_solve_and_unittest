package FirstWeek.HashardNum;

import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {

        boolean answer = false;
        Integer num = x;
        ArrayList<Integer> SplitNums = new ArrayList<>();
        while (num > 0) {
            SplitNums.add(num % 10);
            num /= 10;
        }
        int sum = 0;
        for (int number : SplitNums) {
            sum += number;
        }
        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }
}
