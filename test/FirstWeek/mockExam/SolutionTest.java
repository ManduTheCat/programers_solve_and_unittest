package FirstWeek.mockExam;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test(){
        Solution test = new Solution();
        assertArrayEquals(test.solution(new int[]{3, 3, 1, 2, 5}), new int[]{3});
//        assertArrayEquals(test.solution(new int[]{3, 3, 1, 2, 5}), new int[]{3});
    }
    @Test
    public void test1(){
        Solution test = new Solution();
        assertArrayEquals(test.solution(new int[]{5,5,4,2,3}), new int[]{1,2,3});
    }

    @Test
    public void test2(){
        Solution test = new Solution();
        assertArrayEquals(test.solution(new int[]{5}), new int[]{0});
    }

}