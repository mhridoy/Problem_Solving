package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ANewYearAndHurry {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int sum=0;
        int count=0;
        for (double i = 1; i <=n ; i++) {
            sum+=5*i;
            double ans = ((sum+k)/60.00);
            //out.println(ans);
            if(4.00>=ans)count++;

        }
        out.println(count);
    }
}
