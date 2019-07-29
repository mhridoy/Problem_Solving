package Dimik;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Problem_1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- !=0)
        {
            int number = in.nextInt();
            if(number%2==0)
                out.println("even");
            else
                out.println("odd");
        }
    }
}
