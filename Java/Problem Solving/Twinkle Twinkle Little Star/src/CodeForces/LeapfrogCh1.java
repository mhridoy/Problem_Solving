package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

public class LeapfrogCh1 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int intVal = 0;

        try {
            intVal = Integer.parseInt(in.next());
        } catch (NumberFormatException e) {
            //Log it if needed
            intVal =0; //default fallback value;
        }
        while (intVal--!=0){
            String s = in.next();
            out.println(s);
        }
    }
}
