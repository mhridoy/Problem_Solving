package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class DEnoughArray {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    long n = in.nextLong(),k= in.nextLong(),ans=0;
    long arr[] = new long[(int)n+1],ps[]= new long[(int)n+1];
        for(int i = 1 ; i <= n ; i++){
            arr[i]=in.nextLong() ;
            ps[i] = ps[i - 1] + arr[i] ;
        }
        for(int i = 1 ; i <= n ; i++){
            long hi = n , lo = i ;
            if(ps[(int)lo - 1] + k > ps[(int)hi]) continue ;
            while(hi >= lo){
                if(hi == lo){
                    if(arr[(int)hi] >= k) ans++ ;
                    break;
                }
                if(hi - lo <= 1){

                    if(ps[(int)lo] >= ps[i - 1] + k) ans += (n - lo + 1) ;
                    else ans += (n - hi + 1) ;
                    break ;
                }
                long mid = hi + lo ;
                mid /= 2 ;
                if(ps[(int)mid] < ps[i - 1] + k) lo = mid ;
                else hi = mid ;
            }
        }
        out.println(ans);
    }
}
