package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class AChungaChanga {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x=in.nextLong();
        long y=in.nextLong();
        long z=in.nextLong();
        long ans1=x%z;
        long ans2=y%z;

        out.print((x+y)/z+" ");

        if(ans1+ans2<z)
            out.println(0);
        else out.println(z-Math.max(ans1,ans2));

    }
}
