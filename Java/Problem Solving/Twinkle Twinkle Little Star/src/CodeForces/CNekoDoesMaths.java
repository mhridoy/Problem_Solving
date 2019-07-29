package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CNekoDoesMaths {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long min = Long.MAX_VALUE;
        long index=0;
        for (int i = 0; i <=10 ; i++) {
            if(min>lcm(a+i,b+i)){
               min= lcm(a+i,b+i);
               index=i;
            }
        }
        out.println(index);
    }
    static long gcd(long a , long b ){
        if (b == 0)
        return a;
        return gcd(b, a % b);
    }
    static  long lcm(long a,long b){
        return a * b / gcd(a, b);
    }
}
