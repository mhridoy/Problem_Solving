package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class APresents {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n  = in.nextInt();
        int array [] = new int[n+2];
        for (int i = 1; i <=n ; i++) {
            int x = in.nextInt();
            array[x] =i;
        }
        for (int i = 1; i <=n ; i++) {
            out.print(array[i]+" ");
        }
    }
}
