package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AMakeATriangle {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        List<Integer> array = new LinkedList<>();
        for (int i = 0; i <3 ; i++) {
            int x = in.nextInt();
            array.add(x);
        }
        Collections.sort(array);
        if(array.get(2)>=array.get(1)+array.get(0))
        {
            out.println(array.get(2)-(array.get(0)+array.get(1))+1);
        }
        else out.println(0);
    }
}
