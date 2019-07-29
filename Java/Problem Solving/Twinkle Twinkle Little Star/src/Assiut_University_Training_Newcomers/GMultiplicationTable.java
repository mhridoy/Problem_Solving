package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class GMultiplicationTable {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 1; i <=12 ; i++) {
            out.println(String.format("%d * %d = %d",n,i,n*i));
        }
    }
}
