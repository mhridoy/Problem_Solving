package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class D4 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while(test -- !=0)
        {
            String a = in.next();
            String b = in.next();
            BigInteger aa = new BigInteger(a);
            BigInteger bb = new BigInteger(b);
            aa=aa.abs();
            bb=bb.abs();
            if(aa.mod(bb)==BigInteger.ZERO)
            {
                out.println(String.format("Case %d: divisible",++index));
            }
            else  out.println(String.format("Case %d: not divisible",++index));
        }
    }
}
