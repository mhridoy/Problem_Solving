package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CElephant {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long point = in.nextLong();
        long ans_1=Integer.MAX_VALUE,ans_2=Integer.MAX_VALUE,ans_3=Integer.MAX_VALUE,
                ans_4=Integer.MAX_VALUE,ans_5=Integer.MAX_VALUE;
        if(point%1==0)
         ans_1 = point/1;
         if(point%2==0)
         ans_2 =point/2;
         if(point%3==0)
         ans_3=point/3;
         if(point%4==0)
         ans_4=point/4;
         if(point%5==0)
         ans_5=point/5;
        long min_a=Math.min(ans_1,ans_2);
        long min_b=Math.min(min_a,ans_3);
        long min_c = Math.min(min_b,ans_4);
        long min_d = Math.min(min_c,ans_5);
        out.println(min_d);

    }
}
