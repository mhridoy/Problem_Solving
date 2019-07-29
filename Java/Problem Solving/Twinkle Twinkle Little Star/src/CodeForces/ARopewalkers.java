package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ARopewalkers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt(),b= in.nextInt(),c= in.nextInt(),d= in.nextInt();
        int sum = a+b+c;
        int high = Math.max(a,Math.max(b,c));
        int low = Math.min(a,Math.min(b,c));
        int mid = sum-high-low;
        int min_time = Math.max(0,d - mid + low) + Math.max(0,d + mid - high);
        out.println(min_time);
    }
}
