package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class RGCD {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(gcd(a,b));
    }
    int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1%n2);
        else
            return n1;
    }
}
