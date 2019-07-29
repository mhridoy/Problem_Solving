package cses.fi;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class WeirdAlgorithm {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long number = in.nextLong();
        out.print(number+" ");
        while(number!=1)
        {
            if(number%2==0)
            {
                number=number/2;
                out.print(number);
            }
            //
            else
            {
                number=(number*3)+1;
                out.print(number);
            }
            out.print(" ");

        }
    }
}
