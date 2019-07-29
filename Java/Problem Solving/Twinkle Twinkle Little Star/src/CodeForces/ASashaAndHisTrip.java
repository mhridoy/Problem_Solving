package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ASashaAndHisTrip {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_number_of_cities = in.nextInt();
        int the_capacity_of_the_tank = in.nextInt();
        if(the_capacity_of_the_tank==1)
        {
            int ans = (the_number_of_cities*(the_number_of_cities+1))/2;
            out.println(ans);
        }
        else if(the_number_of_cities<=the_capacity_of_the_tank)
            out.println(the_number_of_cities);
        else {
            int ans = (the_number_of_cities - the_capacity_of_the_tank) * the_capacity_of_the_tank;
            out.println(ans);
        }
    }
}
