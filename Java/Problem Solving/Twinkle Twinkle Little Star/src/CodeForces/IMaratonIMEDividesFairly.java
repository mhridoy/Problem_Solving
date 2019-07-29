package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class IMaratonIMEDividesFairly {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- != 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long difference = Math.abs(a-b);
            if (difference >1) {
                long ans1 = Math.abs(a + b) / 2;
                long ans2 = Math.abs(a + b) % 2;
                    out.println(ans1 + " " + (ans2 + ans1));
            } else
                out.println("Ok");
        }

    }

}
