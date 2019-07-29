package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class UTriangularNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        if(isTriangularnumber(number))
        out.println("YES");
        else
            out.println("NO");
    }

    private boolean isTriangularnumber(int number) {
       double ans = (Math.sqrt(8*number+1)-1)/2;
       if(ans==(int)ans)
           return true;
       else
           return false;

    }
}
