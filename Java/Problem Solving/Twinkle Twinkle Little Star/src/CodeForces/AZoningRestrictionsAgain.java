package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AZoningRestrictionsAgain {
    static int array[]= new int[100];
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt(),h = in.nextInt(),m = in.nextInt();
        meter_calculate(n,h);
        for(int i=0;i<m;i++){
            int l=in.nextInt(),r=in.nextInt(),x=in.nextInt();

            for(;l<=r;l++){
                if(array[l]>x)array[l]=x;
            }
        }
        long  ans=calculate(n);
        out.println(ans);

    }
    static void meter_calculate(int n,int h){
        for(int i=1;i<=n;i++){
            array[i]=h;
        }
    }
    static long  calculate(int n){
        long  u=0;
        for(int i=1;i<=n;i++){
            u+=(array[i]*array[i]);
        }
        return u;
    }
}
