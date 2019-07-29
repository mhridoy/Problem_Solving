package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ANastyaIsReadingABook {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int start [] = new int[n];
        int finish[] = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = in.nextInt();
            finish [i] = in.nextInt();
        }
        int l = start[0];
        int r = finish[n-1];
        int k = in.nextInt();
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(!check(start[i],finish[i],k))count++;


        }
        out.println(count);
    }

    private boolean check(int i, int finish, int k) {
        if(i>k && finish>k)return false;
        else if(i<k && finish<k) return true;
        else
            return false;

    }
}
