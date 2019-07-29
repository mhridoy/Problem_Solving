package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class APointsInSegments {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <=m ; i++) {
            array.add(i);
        }
        ArrayList<Integer> crray = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            crray.add(x);
        }
        if(n==1)
        {
            out.println(0);
            return;
        }
        Collections.sort(crray);
        int count=0;
        ArrayList<Integer> drray = new ArrayList<>();
        for(int x : array)
        {
            if(!found(x,crray))
            {
                count++;
                drray.add(x);
            }
        }
        out.println(count);
        for (int i = 0; i <drray.size() ; i++) {
            out.print(drray.get(i)+" ");
        }
    }

    private boolean found(int x, ArrayList<Integer> m ) {

        for (int i = 0; i <m.size() ; i++) {
            if(x==m.get(i))
            {
                return true;

            }
        }
        return false;
    }
}
