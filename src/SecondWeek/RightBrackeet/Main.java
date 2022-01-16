package SecondWeek.RightBrackeet;

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("(()))"));
        System.out.println(test.solution("(())()"));
        System.out.println(test.solution("()()"));
        System.out.println(test.solution(")()("));
        System.out.println(test.solution("(()("));
        System.out.println();
        Solution1 test1 = new Solution1();
        System.out.println(test1.solution("(()))"));
        System.out.println(test1.solution("(())()"));
        System.out.println(test1.solution("()()"));
        System.out.println(test1.solution(")()("));
        System.out.println(test1.solution("(()("));
        System.out.println(test1.solution("())(()"));
        System.out.println();
        Solution2 test2 = new Solution2();
        System.out.println(test2.solution("(()))"));
        System.out.println(test2.solution("(())()"));
        System.out.println(test2.solution("()()"));
        System.out.println(test2.solution(")()("));
        System.out.println(test2.solution("(()("));
        System.out.println(test2.solution("())(()"));
    }
}
