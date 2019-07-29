package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class PFibonacci {


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long fibo[] = new long [1000];
        int n = in.nextInt();
        Arrays.fill(fibo,-1);
        out.println(fibo(n-1,fibo));
    }

    private long fibo(int n, long[] fibo) {
        if(n==0) return 0;
         if(n==1) return 1;
         if(fibo[n]==-1)
             fibo[n]=  (fibo(n-1, fibo)+fibo(n-2, fibo));
         return fibo[n];
    }

}
