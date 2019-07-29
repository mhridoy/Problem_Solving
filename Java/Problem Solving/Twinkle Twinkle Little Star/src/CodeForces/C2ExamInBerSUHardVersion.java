package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class C2ExamInBerSUHardVersion {


     int mx = 200005;
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n=in.nextLong(),m=in.nextLong();
        int[] a=new int[mx];
        int[] sum=new int[mx];
        for(int i = 0; i < n; i++)
            a[i]=in.nextInt();

        sum[0]=a[0];
        for(int i = 1; i < n; i++)
            sum[i]=a[i]+sum[i-1];

        out.print("0 ");
        for(int i = 1; i < n; i++)
        {
            if(sum[i] <= m)
            {
                out.print("0 ");
                continue;
            }
            Arrays.sort(a,0,i);
            int x = i-1;
            int temp = sum[i];
            while(temp > m && x >= 0)
            {
                temp = temp - a[x];
                x--;
            }
            out.print(i-x-1+" ");
        }
    }
}
