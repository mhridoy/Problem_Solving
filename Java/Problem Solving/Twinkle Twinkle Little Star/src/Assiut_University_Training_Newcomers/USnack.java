package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class USnack {
    public void solve(int testNumber, InputReader in, PrintWriter out) {


        double price[] = {4.00, 4.50, 5.00, 2.00, 1.50};
        int code= in.nextInt();
        double quantity = in.nextDouble();
        out.println(String.format("Total: R %.2f",price[code-1]*quantity));



    }
}

