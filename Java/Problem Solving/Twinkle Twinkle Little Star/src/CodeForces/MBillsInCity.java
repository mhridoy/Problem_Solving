package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class MBillsInCity {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long array[] = new long[n];
        long low = Long.MAX_VALUE;
        long high= Long.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            array[i] = in.nextLong();

        }
        for (int i = 0; i <n-1 ; i++) {
            long d = Math.abs(array[i]-array[i+1]);
            if(d>high)high=d;

        }



        out.println(high);
    }
}
