package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ADreamoonAndStairs {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = n/2;
        if(n%2!=0)ans++;
        if (n < m) out.println(-1);
        else if (n == m) out.println(n);
        else {
            for (int i = ans; i < n; i++) {
                if (i % m == 0) {
                    out.println(i);
                    break;
                }

            }
        }
    }

}
