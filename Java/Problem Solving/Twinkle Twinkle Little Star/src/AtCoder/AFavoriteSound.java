package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AFavoriteSound {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans = b/a;
        if(ans>c)
            out.println(c);
        else
            out.println(ans);
    }
}
