package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class EmoogleBalance {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int index=0;
        while(in.hasNext()) {
            int n = in.nextInt();
            if(n==0 )return;
            int give_me_treat =0,give_us_treat=0;
            while (n-- != 0) {
                int x = in.nextInt();
                if(x==0)give_us_treat++;
                else give_me_treat++;
            }
            out.println(String.format("Case %d: %d",++index,(give_me_treat-give_us_treat)));
        }
    }
}
