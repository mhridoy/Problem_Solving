package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QHEAP1 {
    public void solve(int testNumber, InputReader on, PrintWriter out) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> heap = new PriorityQueue<>(in.nextInt());

        while (in.hasNext()) {
            switch (in.nextInt()) {
                case 1:
                    heap.add(in.nextInt());
                    break;
                case 2:
                    heap.remove(in.nextInt());
                    break;
                case 3: {
                    System.out.println(heap.peek());
                }
                break;
            }
        }
    }
}
