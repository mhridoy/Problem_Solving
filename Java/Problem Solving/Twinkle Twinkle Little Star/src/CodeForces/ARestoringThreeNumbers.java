package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.Arrays;

public class ARestoringThreeNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long array [] = new long[4];
        for (int i = 0; i <4 ; i++) {
            array[i]= in.nextLong();
        }
        Arrays.sort(array);
        for (int i = 0; i <3 ; i++) {
            out.print(array[3]-array[i]+" ");
        }
    }
}
