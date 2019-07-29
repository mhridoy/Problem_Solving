package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ARegularBracketSequence {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if((a!=0 && a==d) ||(a==0  &&c==0 &&d==0)||(a==0 && b==0 && c==0 &&d==0))
            out.println(1);
        else
            out.println(0);
    }
}
