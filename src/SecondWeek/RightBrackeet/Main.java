package SecondWeek.RightBrackeet;

public class Main {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution("(()))"));
        System.out.println(test.solution("(())()"));
        System.out.println(test.solution("()()"));
        System.out.println(test.solution(")()("));
        System.out.println(test.solution("(()("));
    }
}
