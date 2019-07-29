package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BrickWallPatterns {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext())
        {
            long x = in.nextInt();
            if(x==0)break;
            out.println(fibo(x+1));
        }
    }
    long fibo(long n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
