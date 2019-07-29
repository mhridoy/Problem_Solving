package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ChefAndIngredients {
    static long MOD= 1000000007;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    int test= in.nextInt();
    long mod=MOD;
    while (test--!=0){
        long n = in.nextLong();
        long k = in.nextLong();
        long count=0,ans=0;
        long ft = k-1;
        count=-(n-1);
        long no = (long) Math.ceil((k-1)/(n-1));
        ans =( no * ( 2 * ft + (( no -1 ) * count )) )/ 2;
        out.println(ans);
//        if(n==2){
//            out.println(((k*(k-1))/2)%MOD);
//        }
//        else if(n==k) {
//            out.println((n-1)%MOD);
//        }
//        else{
//            ans=(k%MOD*((k-2)%MOD*inversemod(n-1,mod))%MOD)%mod + k%mod;
//
//            if(ans%2==0) out.println((ans/2)%MOD);
//            else out.println(((ans/2)+1)%MOD) ;
//        }

    }
    }
    static  long inversemod(long a,long mod){
        return power(a,mod-2,mod);
    }
    static long power(long a , long b ,long mod ){
        long r =1 ;
        while(b>0){
            if((b & 1) == 0) r=(r*a)%mod;
            a=(a*a)%mod;
            b>>=1;
        }
        return r;
    }
}
