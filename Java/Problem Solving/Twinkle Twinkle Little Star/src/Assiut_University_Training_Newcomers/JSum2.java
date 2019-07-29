package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class JSum2 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long number = in.nextLong();
        long x = in.nextLong();

        long sum=0;
        String value = String.valueOf(x);
        for (int i = 0; i <value.length() ; i++) {
           // sum+= (long) Long.parseInt(String.valueOf(value.charAt(i)));
        }
        out.println(sum);
    }
}
