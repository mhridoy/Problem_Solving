package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class Staircase {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            //for space
            for (int j = i; j <n-1 ; j++) {
             out.print(" ");
            }
            //star
            for (int j = 0; j <=i ; j++) {
                out.print("#");
            }
            out.println();
        }
    }
}
