package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Vanyaaa_Fence {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number_of_friends = in.nextInt();
        int height_of_fence = in.nextInt();
        int width_of_road=0;
        for (int i = 0; i <number_of_friends ; i++) {
            int each_friends_height = in.nextInt();
            if(each_friends_height<=height_of_fence)width_of_road++;
            else width_of_road+=2;
        }
        out.println(width_of_road);
    }
}
