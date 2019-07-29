package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AReverseString {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n= in.nextInt();
        String a = in.next();
        for (int i = 0; i <n-1 ; i++) {
            if(a.charAt(i)>a.charAt(i+1))
            {
                out.println("YES");
                out.println((i+1)+" "+(i+2));
                return;
            }
        }
        out.println("NO");

    }
}
