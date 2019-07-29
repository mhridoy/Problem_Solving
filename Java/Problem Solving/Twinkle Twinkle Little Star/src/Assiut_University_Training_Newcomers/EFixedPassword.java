package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class EFixedPassword {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()) {
            int n = in.nextInt();
            if(n==1999)
                out.println("Correct");
            else out.println("Wrong");
        }
    }

}
