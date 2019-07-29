package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CMysteryCircuit {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String s = in.next();
        if(s.length() > 10 )
        {
            out.println("NO");
            return ;
        }
        int n=s.charAt(s.length()-1)-s.charAt(0);
        if(n<= 10 && n>=0) out.println("YES");
        else out.println("NO");

    }
}
