package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AInscribedFigures {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int cnt = 0, prev = a, preprev = -1;
        boolean msg = false;
        for(int i = 1; i < n; ++i){
            a = in.nextInt();
            if(a == 1){
                if(prev == 3) cnt += 4;
                else cnt += 3;
            }
            else if(a == 2){
                if(prev == 3) msg = true;
                else cnt += 3;
            }
            else{
                if(prev == 2) msg = true;
                else cnt += 4;
            }
            if(preprev == 3 && prev == 1 && a == 2) --cnt;
            if(preprev == 1 && prev == 3 && a == 2) cnt -= 2;
            preprev = prev;
            prev = a;
        }
        if(msg) out.print( "Infinite");

        else {
            out.println( "Finite");
            out.println(cnt);
        }
    }
    }

