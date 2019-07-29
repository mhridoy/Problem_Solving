package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Aspirations {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long l = in.nextLong();
        long r = in.nextLong();
        long d = in.nextLong();
        if(d>r){
            out.println("impossible");
            return;
        }
        List<Long> arr = new ArrayList<>();
        int cout=0;
        long x =0,y=0;

        for (long i = l; i <=r ; i++) {
            if(i%d==0)
            {
                if(cout%2==0)
                     x = i;
                else y =i;
                arr.add(i);
                if(arr.size()%2==0)
                {
                    if(gcd(x,y)==d)
                    {
                        break;
                    }

                }
            }
        }
        if(arr.size()==0)
        {
            out.println("impossible");
            return;
        }
        out.println(arr.size());
        for (int i = 0; i <arr.size() ; i++) {
            out.print(arr.get(i)+" ");
        }
    }
    long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
