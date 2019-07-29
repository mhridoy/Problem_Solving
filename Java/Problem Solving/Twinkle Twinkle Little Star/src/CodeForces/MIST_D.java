package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;




public class MIST_D {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while(test-- !=0)
        {
            int n = in.nextInt();
            String temp="";
            boolean flag =true;
            for (int i = 1; i <=n ; i++) {
                int x = in.nextInt();
                if(x%2==0)
                {
                    temp+='1';
                    flag=false;
                }
                else if(!flag)
                    temp+='0';
            }
            out.println(String.format("Case %d: %s",++index,temp));
        }
    }

}
