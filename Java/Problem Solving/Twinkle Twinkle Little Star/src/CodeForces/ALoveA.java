package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ALoveA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String a = in.next();
        int len = a.length();
        int a_count=0;
        int other_count=0;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)=='a')a_count++;
            else other_count++;

        }
        out.println(a.length()-a_count);
    }
}
