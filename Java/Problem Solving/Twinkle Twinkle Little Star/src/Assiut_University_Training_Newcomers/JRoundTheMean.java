package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class JRoundTheMean {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        int ans = (int) Math.ceil((a+b)/2);
        out.println(ans);
    }
}
