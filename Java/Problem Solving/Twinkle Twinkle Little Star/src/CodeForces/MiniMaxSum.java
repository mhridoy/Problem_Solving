package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class MiniMaxSum {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long arr[] = new long[5];
        long sum_max=0,sum_min=0;
        for (int i = 0; i <5 ; i++) {
            arr[i]= in.nextLong();
            sum_max+=arr[i];
            sum_min+=arr[i];
        }
        long min= Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i <5 ; i++) {
            long current =arr[i];
            if(sum_max-current>max)max=sum_max-current;
             if((sum_min-current)<min) min= (sum_min-current);

        }
        out.println(min+" "+max);
    }
}
