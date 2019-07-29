package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ADinnerWithEmma {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int cost =0;
        boolean flag =true;
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                int x = in.nextInt();
                if(x==i &&j==x){
                    cost=i;
                    if(flag)min=Integer.MAX_VALUE;
                    flag=false;
                    if(min>cost)min=cost;
                }
                else{
                    if(flag)
                    if(x<min)min=x;
                }
            }
        }
        out.println(min);
    }
}
