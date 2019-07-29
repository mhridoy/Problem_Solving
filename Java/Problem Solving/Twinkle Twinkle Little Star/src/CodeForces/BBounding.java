package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class BBounding {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    long n = in.nextLong(),x= in.nextLong();
    long count=1,sum=0;
        for (long i = 1; i <=n ; i++) {
            long y = in.nextLong();
            sum+=y;
            if(sum<=x)count++;
        }
        out.println(count);

    }
}
