package SecondWeek.RightBrackeet;
import java.util.Stack;
public class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st = new Stack<>();
        if(s.charAt(0) == ')'){
            return false;
        }
        else if(s.charAt(s.length() - 1) == '('){
            return false;
        }
        else {
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }
                else{
                    if(st.empty()){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
            }

        }
        if(st.empty()){
            answer = true;
        }

        return answer;
    }
}
