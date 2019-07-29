package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class GudduOnADate {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    int test =in.nextInt();
    while (test--!=0){
        long n = in.nextLong();
        long sum= DigitSum(n);
        long remain= 10-sum%10;
        remain%=10;
        out.println(n+""+remain);
    }
    }
    static long  DigitSum(long  n)
    {
        long  sum = 0;
        while(n>0)
        {
            sum = sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
