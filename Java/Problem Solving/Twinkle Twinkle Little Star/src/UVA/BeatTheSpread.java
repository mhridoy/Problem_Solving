package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BeatTheSpread {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- != 0) {
            long s = in.nextLong();
            long d = in.nextLong();
            if(s==0 && d==0)
            {
                out.println(0+" "+0);
                //return;
            }
            else if(s==1 && d==1)
                out.println(1+" "+0);
            else {
                if (s > d) {
                    long diff = (s - d) / 2;
                    long sum = (s + d) / 2;
                    if (diff + sum == s && Math.abs(diff - sum) == d) {
                        if (diff > sum)
                            out.println(diff + " " + sum);
                        else
                            out.println(sum + " " + diff);
                    } else out.println("impossible");
                } else
                    out.println("impossible");
            }
        }
    }
}
