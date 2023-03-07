package exam;

import java.util.Stack;

public class LC844_BackspaceStringCompare {
    // Tìm ra các kí  tự còn lại của từng chuỗi bằng stack sau đó so sánh với nhau sử dụng equals
    public static boolean backspaceCompare(String s, String t) {
        return rsStack(s).equals(rsStack(t));
    }

    // xử lý từng chuỗi
    public static Stack<Character> rsStack(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#')
            {
                if(!stack.isEmpty())
                    stack.pop();
            }else
                stack.push(c);
        }
        return stack;
    }
    // => O(n)
}
