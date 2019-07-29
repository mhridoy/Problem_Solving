package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class QDivisors {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)out.println(i);
        }
    }
}
