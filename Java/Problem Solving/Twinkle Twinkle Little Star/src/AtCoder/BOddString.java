package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BOddString {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String s = in.next();
        String concate ="";
        for (int i = 0; i <s.length() ; i++) {
            if(i%2==0)
               out.print(s.charAt(i));
        }
        out.println();
    }
}
