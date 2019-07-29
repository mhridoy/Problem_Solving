package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class IShape1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                out.print("*");
            }
            out.println();
        }
    }
}
