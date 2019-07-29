package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AServalAndBus {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n=in.nextInt();
        int t=in.nextInt();
        int[] s=new int[n];
        int[] d=new int[n];

        for(int i=0;i<n;i++)
        {
            s[i]=in.nextInt();
            d[i]=in.nextInt();

        }

        int res=-1;
        int x,y,min1=Integer.MAX_VALUE;


        for(int i=0;i<n;i++)
        {
            if(t==s[i])
            {
                res=i+1;
                break;
            }
            else
            {
                if(t>s[i])
                {
                    x=(int)Math.ceil(1.0*(t-s[i]))/d[i];
                    if(min1>(t-(s[i]+x*d[i])))
                    {
                        min1=(t-(s[i]+x*d[i]));
                        res=i+1;
                    }
                }
                else{
                    if(min1>(s[i]-t)){
                        min1=(s[i]-t);
                        res=i+1;
                    }
                }
            }
        }

        out.println(res);
    }
}
