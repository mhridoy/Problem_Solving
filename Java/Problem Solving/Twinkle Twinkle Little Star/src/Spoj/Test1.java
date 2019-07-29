package Spoj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Test1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext())
        {
            int a = in.nextInt();
            int b = in.nextInt();
            out.println(a+b);
        }
    }
}
