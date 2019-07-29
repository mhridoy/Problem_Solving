package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class OperationsOnAnArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.nextLong();
        long array [] = new long[(int)n];
        long difference =0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextLong();
        }
        for (int i = 0; i <n-1 ; i++) {
            difference+=Math.abs(array[i+1]-array[i]);
        }
        out.println(difference);
    }
}
