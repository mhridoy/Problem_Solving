package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class MultiplicationTable {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long x = in.nextLong();
        int count=0;
        for (long i = 1; i <=n ; i++) {

            if (x % i == 0&& x/i <= n) count++;

        }
            out.println(count);
    }
}
