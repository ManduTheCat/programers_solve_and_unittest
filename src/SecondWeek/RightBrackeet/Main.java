package SecondWeek.RightBrackeet;

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("(()))"));
        System.out.println(test.solution("(())()"));
        System.out.println(test.solution("()()"));
        System.out.println(test.solution(")()("));
        System.out.println(test.solution("(()("));

        Solution1 test1 = new Solution1();
        System.out.println(test1.solution("(()))"));
        System.out.println(test1.solution("(())()"));
        System.out.println(test1.solution("()()"));
        System.out.println(test1.solution(")()("));
        System.out.println(test1.solution("(()("));
    }
}
