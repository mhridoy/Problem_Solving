package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Stack;

public class BalancedBrackets {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        tests:
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack<Character> stack = new Stack<>();

            for(char c : s.toCharArray())
            {
                if(c == '(')
                    stack.push(')');
                else if(c == '{')
                    stack.push('}');
                else if(c == '[')
                    stack.push(']');

                else{
                    if( stack.isEmpty() || c != stack.peek()){
                        out.println("NO");
                        continue tests;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
