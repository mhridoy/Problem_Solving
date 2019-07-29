package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class KFactorial {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        while (n-- !=0)
        {
            long x = in.nextLong();
            out.println(factorial(x));
        }
    }

    private long factorial(long x) {
        if(x==1 || x==0) return 1;
        return x*factorial(x-1);
    }
}
