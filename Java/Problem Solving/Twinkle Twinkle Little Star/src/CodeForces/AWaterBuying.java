package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class AWaterBuying {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long test = in.nextLong();
        while (test-- !=0)
        {
           long BuyLitter = in.nextLong();
           long PriceOfOneLitter = in.nextLong();
           long PriceOfTwoLitter = in.nextLong();
            if (2*PriceOfOneLitter<=PriceOfTwoLitter)
            {
                out.println(PriceOfOneLitter*BuyLitter);
            }
            else if (BuyLitter%2==0)
            {
                out.println((BuyLitter/2)*PriceOfTwoLitter);
            }
            else if (BuyLitter%2!=0)
            {
                out.println((BuyLitter/2)*PriceOfTwoLitter+PriceOfOneLitter);
            }
        }
    }
}
