package CodeForces;

import Fast_IO.InputReader;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class SwapsAndSum {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
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

        /* Only shifts stacks if necessary */
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

