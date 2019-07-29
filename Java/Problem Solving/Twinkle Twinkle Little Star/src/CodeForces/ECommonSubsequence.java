package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ECommonSubsequence {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
         long a,b,c,i = 0,j,k,l,m,n,s,x[]=new long[2040],y[]=new long[2040],z[][]=new long[2040][2040];
         n = in.nextLong();
         m = in.nextLong();
         for(;i++<n;)
             x[(int) i]=in.nextLong();
        for(i=0;i++<m;)y[(int) i]=in.nextLong();
        for(i=0;i<=n;i++)for(j=0;j<=m;j++) {
            z[(int) i][(int) j] = (i < 1 | j < 1 ? 1 :
                    z[(int) (i - 1)][(int) j] + z[(int) i][(int) (j - 1)] - (x[(int) i] == y[(int) j] ? 0 : z[(int) (i - 1)][(int) (j - 1)])) % 1000000007;
        }
        out.println(z[(int) n][(int) m]);
    }
}
