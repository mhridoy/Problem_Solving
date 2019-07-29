package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class QualificationRound2019GoogleCodeJam2019 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int test_case=0;
        in.nextLine();
        for(int i =0; i<test;i++)
        {
            String line = in.next();
            out.println(line);
            /*BigInteger n = new BigInteger(line);
            //out.println(line);
            if(n.equals(4))
                out.println(String.format("Case #%d: 2 2",++test_case));
            else {
                BigInteger a = (n.subtract(BigInteger.valueOf(11))).abs();
                out.println("Case #"+(++test_case)+": "+a+" "+"11");
            }*/
        }
    }
}
