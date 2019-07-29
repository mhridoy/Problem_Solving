package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BEvenNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        if(n==1)
        {
            out.println("-1");
            return;
        }
        for (int i = 2; i <=n ; i++) {
            if(i%2==0)
                out.println(i);
        }

    }
}
