package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class PizzaPizza {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        long n=in.nextLong()+1;

        if (n == 1) out.printf("0");
        else if (n % 2 == 0) out.println(n / 2);
        else out.println(n);
    }
}
