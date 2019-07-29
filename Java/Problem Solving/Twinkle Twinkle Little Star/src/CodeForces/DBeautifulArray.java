package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DBeautifulArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int x = in.nextInt();
    long arr [] = new long[300005];
    long s [] = new long[300005];
    long max[] = new long[300005];
    long min[] = new long[300005];
    long min_[] = new long[300005];
        for (int i = 1; i <=n ; i++) {
            arr[i]= in.nextLong();
        }
        s[0]=0;
        for (int i = 1; i <=n ; i++) {
            s[i]=s[i-1]+arr[i];
        }
        max[n]=s[n];
        for (int i = n-1; i >=1 ; i--) {
            max[i]=Math.max(max[i+1],s[i]);
        }
        min[0]=0;
        for(int i=1;i<=n;++i)min[i]=Math.min(min[i-1],s[i]);
        min_[1]=Math.min(0,(x-1)*s[1]+min[1]);
        for(int i=2;i<=n;++i)min_[i]=Math.min(min_[i-1],(x-1)*s[i]+min[i]);
         long res=-Integer.MAX_VALUE;
        for(int i=1;i<=n;++i)res=Math.max(res,max[i]+(x-1)*s[i]-min_[i]);
        out.println(res);
    }
}
