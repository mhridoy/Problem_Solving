package CodeForces;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class AGravityFlip {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int test = in.nextInt();
        int array [] = new int[test];
        for (int i = 0; i <test ; i++) {
            array[i]= in.nextInt();
        }
        Arrays.sort(array);
        for(int x: array)out.print(x+" ");
    }
}
