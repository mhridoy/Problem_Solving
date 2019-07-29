package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AGCDAndLCM {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            out.println(gcd(a,b)+" "+lcm(a,b));
        }
    }

    private int  lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    private int gcd(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}
