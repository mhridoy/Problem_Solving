package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class FibsievesFantabulousBirthday {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while(test -- !=0)
        {
            long num = in.nextLong();
            double col = Math.sqrt(num);
            int row = (int) (num-((col-1)*(col-1)));
            if(num==(int)(col*col))out.println(String.format("Case %d: 1 %d",++index,row,(int)col));
            else
                out.println(String.format("Case %d: %d %d",++index,row,col));
        }
    }
}
