package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CAlarmClocksEverywhere {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int m = in.nextInt();
    long get_gcd=0;
    long array[] = new long[n];
    long crray[] = new long[m];
        for (long i = 0; i <n ; i++) {
            array[(int)i]= in.nextLong();
            if(i>0){
                get_gcd = gcd(get_gcd,array[(int)i]-array[(int)i-1]);
            }
        }
        for (long i = 0; i <m ; i++) {
            crray[(int)i]= in.nextLong();
            if(get_gcd%crray[(int)i]==0){
                out.println("YES");
                out.println(array[0]+" "+(i+1));
                return;
            }
        }
        out.println("NO");
    }

    private long gcd(long get_gcd, long l) {
        if (l != 0)
            return gcd(l, get_gcd % l);
        else
            return get_gcd;
    }
}
