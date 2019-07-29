package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ASandglass2 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x = in.nextInt();
        int t = in.nextInt();
        if(x>t)
        {
            out.println(x-t);
            return;
        }
        out.println(0);

    }
}
