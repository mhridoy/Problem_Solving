package Spoj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HalfOfTheHalf {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test -- !=0)
        {
            String s = in.next();
            for (int i = 0; i <s.length()/2 ; i++) {
                out.print(s.charAt(i));
                i=i+1;
            }
            out.println();
        }
    }
}
