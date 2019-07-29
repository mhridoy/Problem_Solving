import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Twinkle Twinkle Little Star
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SwapsAndSum solver = new SwapsAndSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class SwapsAndSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            SwapsAndSum.MyQueue<Integer> queue = new SwapsAndSum.MyQueue<Integer>();
            int n = in.nextInt();

            for (int i = 0; i < n; i++) {
                int operation = in.nextInt();
                if (operation == 1) { // enqueue
                    queue.enqueue(in.nextInt());
                } else if (operation == 2) { // dequeue
                    queue.dequeue();
                } else if (operation == 3) { // print/peek
                    System.out.println(queue.peek());
                }
            }
        }

        public static class MyQueue<Integer> {
            private Stack<Integer> stack1 = new Stack<>();
            private Stack<Integer> stack2 = new Stack<>();

            public void enqueue(Integer num) {
                stack1.push(num);
            }

            public Integer dequeue() {
                if (size() == 0) {
                    return null;
                }
                if (stack2.isEmpty()) {
                    shiftStacks();
                }
                return stack2.pop();
            }

            public Integer peek() {
                if (size() == 0) {
                    return null;
                }
                if (stack2.isEmpty()) {
                    shiftStacks();
                }
                return stack2.peek();
            }

            private void shiftStacks() {
                if (stack2.isEmpty()) { // shifting items while stack2 contains items would mess up our queue's ordering
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
            }

            public int size() {
                return stack1.size() + stack2.size();
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

