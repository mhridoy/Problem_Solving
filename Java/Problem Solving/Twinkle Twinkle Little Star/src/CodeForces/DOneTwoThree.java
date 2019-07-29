package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class DOneTwoThree {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            String s = in.next();
            if(s.length()==5)
                out.println(3);
            else if((s.charAt(0)=='t' && s.charAt(1)=='w')||(s.charAt(0)=='t'&&s.charAt(2)=='o'))
                out.println(2);
            else
                out.println(1);
        }
    }
}
