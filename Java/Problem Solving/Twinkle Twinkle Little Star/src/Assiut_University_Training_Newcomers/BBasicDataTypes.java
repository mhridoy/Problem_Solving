package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BBasicDataTypes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        long b = in.nextLong();
        char c = in.next().charAt(0);
        double d = in.nextDouble();
        double e = in.nextDouble();
        out.print(String.format("%d\n%d\n%c\n%.2f\n%.1f\n",a,b,c,d,e));
    }
}
