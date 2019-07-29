package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class DWoodenFence {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int test = in.nextInt();
        while (test--!=0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int n_x=n/2+1;
            int n_y=n/2;
            if(x>=n_x&&y>=n_y)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
