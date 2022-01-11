package SecondWeek.RightBrackeet;
import java.util.Stack;
public class Solution1 {
	boolean solution(String s) {
		Stack<Character> st = new Stack<>();
		if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(')return false;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)=='(')st.push(s.charAt(i));
			else if(st.empty()) return false;
			else st.pop();
			}
		return st.empty();
	}
}
//현상을 구현하려 하지말고 규칙을 찾아라!