package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class C3 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while (test -- !=0)
        {
            int a = in.nextInt();
            int b =  in.nextInt();
            int c = in.nextInt();
            if((a*a+b*b)==c*c ||(c*c+b*b)==a*a || (a*a+c*c)==b*b)
                out.println(String.format("Case %d: yes",++index));
            else
                out.println(String.format("Case %d: no",++index));
        }
    }
}
