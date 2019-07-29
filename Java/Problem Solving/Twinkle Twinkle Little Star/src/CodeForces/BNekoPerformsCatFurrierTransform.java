package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BNekoPerformsCatFurrierTransform {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long num = in.nextLong();
        List<Long> arr = new ArrayList<>();
        if(Math.ceil(log2(num + 1)) == Math.floor(log2(num + 1)) )
        {
            out.println("0");
            return;
        }

        long k = 0;
        long m = 0;
        long p = 0;

        while(true)
        {
            k = CHECKING(num);
            m = (long)Math.pow(2, k + 1);
            m--;
            num = m ^ num;
            arr.add(k + 1);
            p++;

            if(Math.ceil(log2(num + 1)) == Math.floor(log2(num + 1)))
                break;

            num++;
            p++;
            if(Math.ceil(log2(num + 1)) == Math.floor(log2(num + 1)))
                break;
        }

        out.println(p);
        for(long x : arr)
           out.print(x + " ");
    }


    static long CHECKING(long n)


    {
        long p = 0;
        long i = 0;
        long j = 0;
        long k = 0;

        k = n;

        while(k > 0)
        {
            j = k % 2;
            if(j <= 0)
                i = p;

            k /= 2;
            p++;
        }

        return i;
    }
    static double logb(double a, double b)
    {
        return Math.log(a) / Math.log(b);
    }

    static double log2(double a)
    {
        return logb(a, 2);
    }
}
