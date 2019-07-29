package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class FMax {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long max =0;
        for (int i = 0; i <n ; i++) {
            long x =in.nextLong();
            max=Math.max(x,max);
        }
        out.println(max);
    }
}
