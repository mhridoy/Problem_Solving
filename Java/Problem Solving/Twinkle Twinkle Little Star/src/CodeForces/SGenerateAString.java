package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SGenerateAString {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int ans = x+y;
        if(n%ans==0)
            out.println(n/ans);
        else
            out.println(n%ans);
    }
}
