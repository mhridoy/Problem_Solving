package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class VIsIt002 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        char c = in.next().charAt(0);
        int b = in.nextInt();
        char d = in.next().charAt(0);
        int result = in.nextInt();
        if(c=='+')
        {
            if(a+b==result)
                out.println("Yes");
            else
                out.println(a+b);
        }
        else if(c=='*')
        {
            if(a*b==result)
                out.println("Yes");
            else
                out.println(a*b);
        }
        else if(c=='-')
        {
            if(a-b==result)
                out.println("Yes");
            else
                out.println(a-b);
        }
    }
}
