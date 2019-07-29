package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ReduceToOne {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test--!=0){
            double n = in.nextDouble(),sum;
            sum = (n / 6) * (n + 1) * (2 * n + 1);
            out.println(String.format("%.0f",sum));

        }
    }
}
