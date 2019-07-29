package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HelloWorld {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int index = 0;
        while (in.hasNext()) {
                int n = in.nextInt();
                if(n<0)break;
                int count=0;
            for (int i = 1; i <=n ; i++) {
                int copy = i;
                int paste = (copy+i)-n;
                out.println(paste);
                if(paste<=n)
                {
                    count++;
                }

            }
            out.println(count);
        }
    }
}
