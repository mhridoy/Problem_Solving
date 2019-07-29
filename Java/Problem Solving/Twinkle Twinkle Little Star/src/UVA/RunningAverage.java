package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class RunningAverage {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long test = in.nextLong();
        double sum=0;
        for (long i = 1; i <=test ; i++) {
            double x = in.nextDouble();
            sum+=x;

                out.println(sum/i);
        }
    }
}
