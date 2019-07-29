package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CircleInSquare {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while(test-- !=0)
        {
            double radius = in.nextDouble();
            double perimeter = radius*2;
            double square_area = perimeter*perimeter;
            double circle_area = Math.PI*radius*radius;
            out.println(String.format("Case %d: %.2f",++index,square_area-circle_area));
        }

    }
}
