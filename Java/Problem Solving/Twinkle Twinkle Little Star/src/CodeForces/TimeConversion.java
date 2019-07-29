package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class TimeConversion {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String time = in.next();
        if(time.contains("PM"))
        {
            String split [] = time.split("[:]");

             if (Integer.parseInt(split[0])==12){
                //String ans [] = time.split("PM");
                String nn[] = split[2].split("PM");
                out.println("12"+":" +split[1]+":" +nn[0]);

            }
            else {
                int ans= Integer.parseInt(split[0])+12;
                String nn[] = split[2].split("PM");
                out.println(ans+":" +split[1]+":" +nn[0]);
            }

        }
        else
        {

            String split [] = time.split("[:]");

            if (Integer.parseInt(split[0])==12) {
                //String ans [] = time.split("PM");
                String nn[] = split[2].split("AM");
                out.println("00" + ":" + split[1] + ":" + nn[0]);
            }
            else {
                String ans[] = time.split("AM");
                out.println(ans[0]);
            }
        }
    }
}
