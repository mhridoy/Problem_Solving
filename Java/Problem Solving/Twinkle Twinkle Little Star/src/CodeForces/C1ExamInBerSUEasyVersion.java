package CodeForces;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class C1ExamInBerSUEasyVersion {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[n];
        int[] sum=new int[n];
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
