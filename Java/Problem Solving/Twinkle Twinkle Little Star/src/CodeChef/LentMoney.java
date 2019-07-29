package CodeChef;

import java.util.*;
import java.io.PrintWriter;

public class LentMoney {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    int test = in.nextInt();
    while (test--!=0){
        int n = in.nextInt();
        long arr[] = new long[n],sum=0;
        long crr[] = new long[n];
        long drr[] = new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextLong();
            sum+=arr[i];
        }
        long k= in.nextLong();
        long x = in.nextLong();
        //Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            crr[i]=arr[i]^x;
            drr[i]=crr[i]-arr[i];
        }
        Arrays.sort(drr);
        long count=0,index=0;
        long frr[] = new long[n];
        for (int i=n-1;i>=0;--i) {
            if(drr[i]>=0)count++;
            frr[(int) index++]=drr[i];
        }
        long ans =0;
        if(count%k==0){
            for (int i = 0; i <count ; i++) {
                sum+=frr[i];
            }
        }
        else{
            long p = (count/k)*k;
            long temp =0;
            long i=0;
            for ( i = 0; i <p ; i++) {
                sum+=frr[(int)i];
            }
            temp=sum;
            long low = count/k;
            if(low>1){
                for(int j=0;j<k;++j)
                {
                    if((-1*frr[(int)low])>frr[j])
                    {
                        temp -= frr[j];
                    }
                    else
                    {
                        temp += frr[(int)low];
                        low++;
                    }
                }
            }
            else {
                for(;i<p+k;++i)
                {
                    temp += frr[(int)i];
                }
            }
            if(temp>sum)
                sum =temp;
            out.println(sum);
        }
    }
    }
}
