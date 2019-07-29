package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SSequenceOfNumbersAndSum {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            if(n<=0 || m<=0) break;
            int max = Math.max(n, m);
            int min = Math.min(n, m);
            int index = 0;
            int sum = 0;

            for (int i = min; i <= max; i++) {
                out.print(i + " ");
                sum+=i;
            }
            out.println("sum =" + sum);
        }
    }
}
