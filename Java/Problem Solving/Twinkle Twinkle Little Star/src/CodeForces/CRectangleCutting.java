package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class CRectangleCutting {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    long w = in.nextLong(),h= in.nextLong(),x = in.nextLong(),y=in.nextLong();
//        if(h*Math.abs(w-2*x) < w*Math.abs(h-2*y)){
//            double ans = Math.min(h*x, h*(w-x));
//            out.println( String.format("%.6f 0",ans));
//        }
//        if(h*Math.abs(w-2*x) == w*Math.abs(h-2*y)){
//            double ans = Math.min(h*x, h*(w-x));
//            out.println( String.format("%.6f 1",ans));
//        }
//        if(h*Math.abs(w-2*x) > w*Math.abs(h-2*y)){
//            double ans = Math.min(w*y, w*(h-y));
//            out.println( String.format("%.6f 0",ans));
//        }
        double area;
        int d;
        area = ((double)w * (double)h) / 2.0d;
        if(w/2==x &&  w%2==0 && h/2==y && h%2==0){
            d=1;
        } else {
            d=0;
        }
        out.println( String.format("%.6f %d",area,d));
    }
}
