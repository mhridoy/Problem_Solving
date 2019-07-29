package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class APetyaAndOrigami {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int no_of_friends = in.nextInt();
        int  sheets = in.nextInt();
        int red_sheets = 2*no_of_friends;
        int green_sheets = 5*no_of_friends;
        int blue_sheets = 8 *no_of_friends;
        int Buy_NoteBook =((red_sheets+sheets-1)/sheets)+
                ((green_sheets+sheets-1)/sheets)
                +((blue_sheets+sheets-1)/sheets);
        out.println(Buy_NoteBook);




    }
}
