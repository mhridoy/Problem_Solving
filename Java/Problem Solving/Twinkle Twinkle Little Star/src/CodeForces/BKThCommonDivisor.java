package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BKThCommonDivisor {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        int gcd=1;
        int index=0;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            if(a % i==0 && b % i==0) {
                gcd = i;
                array.add(gcd);
                index++;
               // out.println(gcd);
            }
        }
        Collections.sort(array);
        ArrayList<Integer> crray = new ArrayList<>();
        for (int i = array.size()-1; i >=0 ; i--) {
            int x = array.get(i);
            crray.add(x);
        }
        out.println(crray.get(k-1));

    }
}
