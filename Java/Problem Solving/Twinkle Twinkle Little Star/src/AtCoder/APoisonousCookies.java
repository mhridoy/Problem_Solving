package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class APoisonousCookies {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long ans = a+c;
        if(ans%2==0)
        {
            ans+=-1;
            out.println(Math.abs((a-b)-ans));
            return;
        }
        out.println(Math.abs((a-b)-ans));
    }
}
