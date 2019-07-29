package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class TTTTT {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
       int test = 0;
        try {

            test = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        while (test--!=0){
            String t = in.nextLine();
            out.println(t);
        }
    }
}
