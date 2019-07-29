package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] array = new List[n];
        for (int i = 0; i < n; i++) {
            array[i] = new ArrayList<>();
        }
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = array[(x^lastans)%n];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastans = sequence.get(y%sequence.size());
                    out.println(lastans);
                    break;
            }
        }
    }
}
