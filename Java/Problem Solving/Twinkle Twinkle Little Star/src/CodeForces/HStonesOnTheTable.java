package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HStonesOnTheTable {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_number_of_stone = in.nextInt();
        String color = in.nextLine();
        int count=0;
        for (int i = 0; i <color.length()-1 ; i++) {
            if(color.charAt(i)==color.charAt(i+1))count++;
        }
        out.println(count);
    }
}
