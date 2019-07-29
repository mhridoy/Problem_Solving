package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class FReversing {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long array [] = new long[n];
        for (int i = n-1; i >=0 ; i--) {
            array[i]= in.nextLong();
        }
        for (int i = 0; i <n ; i++) {
            out.print(array[i]+" ");
        }
    }
}
