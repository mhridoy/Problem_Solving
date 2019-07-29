package CodeForces;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class BSplitANumber {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
       long n = in.nextLong();
        String s = in.next();
        int len  = s.length();
        BigInteger mins= BigInteger.valueOf(Long.MAX_VALUE);
        for(int i=1;i<len;++i)
        {
            String str = s.substring(0, i );
            String str2 = s.substring(i, len);

            if(str.charAt(0) != '0' && str2.charAt(0) != '0')
            {

                BigInteger x = BigInteger.valueOf(Long.parseLong(str)),y=BigInteger.valueOf(Long.parseLong(str2));


               x.add(y);
                mins =mins.min(x);
            }
        }
        out.println(mins);

    }
}
