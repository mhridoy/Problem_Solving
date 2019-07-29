package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class LightOj_1015 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int no_case=0;
        while (test -- !=0) {
            int no_of_students = in.nextInt();
            int sum=0;
            for (int i = 1; i <=no_of_students ; i++) {
                int x = in.nextInt();
                if(x>0)sum+=x;

            }
            out.println(String.format("Case %d: %d",++no_case,sum));
        }
    }
}
