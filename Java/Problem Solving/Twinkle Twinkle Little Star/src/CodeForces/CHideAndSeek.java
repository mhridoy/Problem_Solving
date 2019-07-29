package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHideAndSeek {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt(),k = in.nextInt(),count=0;
    int max [] = new int[n];
    int min [] = new int[n];
    Arrays.fill(max,Integer.MIN_VALUE);
    Arrays.fill(min,Integer.MAX_VALUE);
    while (k--!=0){
        int a = in.nextInt()-1;
        ++count;
        max[a]=Math.max(max[a],count);;
        min[a]= Math.min(min[a],count);
    }
    long set=0;
        for (int i = 0; i < n - 1; ++i)
        {
            if (min[i] ==Integer.MAX_VALUE)
            {
                set += 3;
            }
            else if (min[i] < Integer.MAX_VALUE&& min[i + 1] == Integer.MAX_VALUE)
            {
                set += 2;
            }
            else if (min[i] < Integer.MAX_VALUE && min[i + 1] < Integer.MAX_VALUE)
                if(min[i] > max[i + 1] || min[i + 1] > max[i])
                {
                    set++;
                }
        }
        if (min[n - 1] ==Integer.MAX_VALUE) set++;
        out.println(set);
    }
}
