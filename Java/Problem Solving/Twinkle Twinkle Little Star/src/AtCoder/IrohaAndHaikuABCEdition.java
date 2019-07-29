package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class IrohaAndHaikuABCEdition {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int array[]={a,b,c};
        Arrays.sort(array);
        if(array[0]==5 && array[1]==5 && array[2]==7)
            out.println("YES");
        else out.println("NO");
    }
}
