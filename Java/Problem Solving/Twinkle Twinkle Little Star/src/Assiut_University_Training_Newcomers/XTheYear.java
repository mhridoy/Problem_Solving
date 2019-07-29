package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class XTheYear {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String months[] = { "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        int n = in.nextInt();
        out.println(months[n-1]);
    }
}
