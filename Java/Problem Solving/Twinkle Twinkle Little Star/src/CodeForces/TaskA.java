package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int andrew = in.nextInt();
        int dmitry = in.nextInt();
        int michal = in.nextInt();
        int green = in.nextInt();
        int purple = in.nextInt();
        int black = in.nextInt();
        if(andrew<=green && (dmitry<=((green-andrew)+purple))&&
                (michal<=(black+purple+green-andrew-dmitry) ))
            out.println("YES");
        else
            out.println("NO");
    }
}
