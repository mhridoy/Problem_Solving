package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ALoveTriangle {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int no_of_plane = in.nextInt();
        int planes [] = new int[no_of_plane];
        for (int i = 0; i <no_of_plane ; i++) {
            planes[i]= in.nextInt()-1;
        }
        int love_triangle = 0;
        while (love_triangle < no_of_plane) {
            // boolean tr = false;
            int firstL = planes[love_triangle];
            int secondL = planes[firstL];
            int thirdL = planes[secondL];
            if (love_triangle == thirdL) {
                out.println("YES");
                return;
            }
            else {
                love_triangle++;
            }
        }
     out.println("NO");

    }
}
