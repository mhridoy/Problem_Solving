package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BKanbanNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        if(number>=1 && number<=10)
            out.println("YES");
        else if(number>=11 && number<=40)
            out.println("NO");
        else if(number>=41 && number<=70)
            out.println("YES");
        else if(number>=71 && number<=99)
            out.println("NO");
    }
}
