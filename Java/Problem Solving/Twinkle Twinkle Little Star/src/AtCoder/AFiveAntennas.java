package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AFiveAntennas {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int k = in.nextInt();
        boolean flag = true;
        if(Math.abs(a-b)<=k && Math.abs(a-c)<=k &&Math.abs(a-d)<=k && Math.abs(a-e)<=k
        && Math.abs(b-c)<=k && Math.abs(b-d)<=k && Math.abs(b-e)<=k &&
                Math.abs(c-d)<=k&&Math.abs(c-e)<=k && Math.abs(d-e)<=k)
            out.println("Yay!");
        else out.println(":(");
    }
}
