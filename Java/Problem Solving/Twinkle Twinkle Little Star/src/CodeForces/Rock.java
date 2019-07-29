package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Rock {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        String a = in.next();
        String b = in.next();
        for (int i = 0; i < test; i++) {
            if(a.charAt(i)==b.charAt(i))
                out.print("P");
            else if(a.charAt(i)=='R' && (b.charAt(i)=='S'||b.charAt(i)=='P'||b.charAt(i)=='R'))
                out.print("R");
            else if((a.charAt(i)=='S'&&b.charAt(i)=='P')||(a.charAt(i)=='P' && b.charAt(i)=='S'))
                out.print("S");
            else
                out.println("P");
        }

    }
}
