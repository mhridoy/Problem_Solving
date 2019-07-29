package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BCanYouSolveThis {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int c = in.nextInt();
        int B [] = new int[m];
        int A[] = new int[m];
        for (int i = 0; i <m ; i++) {
            B[i] = in.nextInt();
        }
        int count=0;
        while(n-- !=0) {
            int sum=0;
            for (int i = 0; i < m; i++) {
                A[i] = in.nextInt();
                sum+=A[i]*B[i];
            }
            if(sum+c>0)count++;
        }
        out.println(count);
    }
}
