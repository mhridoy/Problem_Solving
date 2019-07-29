package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class DEyadAndMath {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test -- !=0)
        {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            if(b*Math.log(a)<d*Math.log(c))
                out.println("<");
            else
                out.println(">");

        }
    }

}
