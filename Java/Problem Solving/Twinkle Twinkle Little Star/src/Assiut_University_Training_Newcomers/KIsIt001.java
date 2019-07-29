package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class KIsIt001 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        char b = in.next().charAt(0);
        int c = in.nextInt();
        if(b=='>')
        {
            if(a>c)
                out.println("Right");
            else
                out.println("Wrong");
        }
        else if(b=='<')
        {
            if(a<c)
                out.println("Right");
            else
                out.println("Wrong");
        }
        else
            out.println("Right");
    }
}
