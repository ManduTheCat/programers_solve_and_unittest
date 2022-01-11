package FirstWeek.mockExam;

import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                count1++;
            }
            if (answers[i] == p2[i % p2.length]) {
                count2++;
            }
            if (answers[i] == p3[i % p3.length]) {
                count3++;
            }
        }
        int max = Math.max(Math.max(count1, count2), count3);
        int[] countArr = {count1, count2, count3};
        return findSameIndex(max, countArr);
    }

    private int[] findSameIndex(int max, int[] countArr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < countArr.length; i++) {
            if (max == countArr[i]) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i -> i + 1).toArray();
    }

}
