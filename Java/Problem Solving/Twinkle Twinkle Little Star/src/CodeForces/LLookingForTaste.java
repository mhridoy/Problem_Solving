package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class LLookingForTaste {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- !=0)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            int sum=0;
            for (int i = 0; i <n ; i++) {
                sum|=in.nextInt();
            }
            out.println(sum);
        }
    }
}
