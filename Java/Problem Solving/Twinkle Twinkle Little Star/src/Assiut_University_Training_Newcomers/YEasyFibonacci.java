package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class YEasyFibonacci {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        printFibonacci(n,out);
    }

    private void printFibonacci(int n, PrintWriter out) {

        int i, t1 = 0, t2 = 1, nextTerm;
        for ( i = 1; i <= n; ++i)
        {
            out.printf("%d ", t1);
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }

    }
}
