package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ADivideIt {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int test=in.nextInt();

        for (int i=0; i<test; i++){
            int count=0;
            boolean flag = true;
            long n = in.nextLong();
            while(n!=1 && flag){
                if (n%2==0){
                    n=n/2;
                }
                else if (n%3==0){
                    n=2*n/3;
                }
                else if (n%5==0){
                    n=4*n/5;
                }
                else
                    flag = false;
               count++;
            }
            if (flag)
               out.println(count);
            else
               out.println(-1);
        }

    }
    }

