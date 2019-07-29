package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class KCyclicShift {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test -- !=0)
        {
            int length = in.nextInt();
            String a = in.nextLine();
            String b = in.nextLine();
            char ch [] =a.toCharArray();
            char dh[] =b.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(dh);
            if(Arrays.equals(ch,dh))
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
