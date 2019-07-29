package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HexABonacci {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test =in.nextInt();
        int index=0;
        while (test-- !=0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();
            int n = in.nextInt();
            int array[] = new int[100005];
            for (int i = 0; i <=n ; i++) {
                 if(i==0) array[i]=a;
                else if( i == 1 ) array[i]=b;
               else if( i == 2 ) array[i]= c;
               else if( i == 3 ) array[i]= d;
                else if( i == 4 ) array[i]= e;
                else if( i == 5 ) array[i]= f;
                else
                array[i]=array[i-1]+array[i-2]+array[i-3]+array[i-4]+array[i-5]+array[i-6];
                array[i]=array[i]%10000007;
            }
            out.println(String.format("Case %d: %d",++index,array[n]% 10000007));
        }
    }
}
