package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ABearAndBigBrother {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int limak = in.nextInt();
        int bob = in.nextInt();
        // the year couldn't exceed 100 years
        int count=0;
        for (int i = 0; i <100 ; i++) {
            limak*=3;
            bob*=2;
            count++;
            if(limak>bob)break;


        }
        out.println(count);
    }
}
