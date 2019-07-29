package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class DivisionOfNlogonia {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()) {
            int test = in.nextInt();
            if (test == 0) break;
            int division_point_x = in.nextInt();
            int division_point_y = in.nextInt();

            while (test-- != 0) {
                int x = in.nextInt();
                int y = in.nextInt();
                if (division_point_x == x || division_point_y == y) out.println("divisa");
                if (division_point_x<x && division_point_y<y )out.println("NE");
                if (x<division_point_x && division_point_y<y) out.println("NO");
                if (x<division_point_x && y<division_point_y) out.println("SO");

                if (division_point_x<x && y<division_point_y) out.println("SE");
            }
        }
    }
}
