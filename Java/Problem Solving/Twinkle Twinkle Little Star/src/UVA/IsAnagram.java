package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class IsAnagram {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String a = in.nextLine();
        String b = in.nextLine();
        char c [] = a.toCharArray();
        char d[] = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d))
            out.println("Yes");
        else
            out.println("No");
    }
}
