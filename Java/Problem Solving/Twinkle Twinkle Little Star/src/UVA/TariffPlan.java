package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class TariffPlan {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int test = in.nextInt();
    int index=0;
    while(test -- !=0)
    {
        int call_duration = in.nextInt();
        int mile_package=0;
        int juice_package =0;
        int sum=0;
        while (call_duration-- !=0)
        {
           int seconds = in.nextInt();
            int minute_mile=seconds/30;
            int minute_juice=seconds/60;
            mile_package+=(minute_mile*10)+10;
            juice_package+=(minute_juice)*15+15;
        }



        if(mile_package==juice_package)
            out.println(String.format("Case %d: Mile Juice %d",++index,mile_package));
        else if(mile_package>juice_package)
            out.println(String.format("Case %d: Juice %d",++index,juice_package));
        else if(mile_package<juice_package) {
            out.println(String.format("Case %d: Mile %d",++index,mile_package));
        }
    }
    }

}
