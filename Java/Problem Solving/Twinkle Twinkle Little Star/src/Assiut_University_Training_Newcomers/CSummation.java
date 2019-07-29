package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CSummation {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        long sum=0;
        while (test -- !=0)
        {
            long x = in.nextLong();
            sum+=x;
        }
        out.println(Math.abs(sum));
    }
}
