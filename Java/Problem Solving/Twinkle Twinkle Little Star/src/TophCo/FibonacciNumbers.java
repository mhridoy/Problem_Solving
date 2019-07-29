package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class FibonacciNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long number = in.nextLong();
        out.print(fibo(number));
    }
    long fibo(long n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
    static long fib(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
        if (n == 0)
            return 0;
        power(F, n-1);

        return F[0][0];
    }
    static void multiply(long F[][], long M[][])
    {
        long x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
        long y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
        long z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
        long w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    static void power(long F[][], long n)
    {
        long i;
        long M[][] = new long[][]{{1,1},{1,0}};
        for (i = 2; i <= n; i++)
            multiply(F, M);
    }
}
