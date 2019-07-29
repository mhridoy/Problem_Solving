package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Stack;

public class MaximumElement {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        Stack<Integer> stack    = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int query = in.nextInt();
            switch (query) {
                case 1:
                    int x = in.nextInt();
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
                case 3:
                    out.println(maxStack.peek());
                    break;
                default:
                    break;
            }
        }
    }
}
