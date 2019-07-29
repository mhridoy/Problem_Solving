package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class BPickingUp {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int test = in.nextInt();
        int count=0;
        while (test--!=0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a-b>=0)count++;
        }
        out.println(count);
    }
}
