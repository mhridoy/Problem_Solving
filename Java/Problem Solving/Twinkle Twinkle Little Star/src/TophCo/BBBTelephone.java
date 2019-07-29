package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BBBTelephone {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int digit = in.nextInt();
    String a = in.next();
    int count=0;
    int sount=0;
        for (int i = 0; i <digit-10.5 ; i++) {
            if(a.charAt(i)=='8')count++;
            else sount++;
        }
        if(count>=sount)
            out.println("YES");
        else
            out.println("NO");
    }

}
