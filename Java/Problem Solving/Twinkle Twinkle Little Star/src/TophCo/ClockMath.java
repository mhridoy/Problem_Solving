package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ClockMath {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        double hour  = in.nextDouble();
        double minute = in.nextDouble();
        double ans = 0.5 *(60*hour-11*minute);
        out.println(String.format("%.7f",Math.min(ans,360.00-ans)));
    }
}
