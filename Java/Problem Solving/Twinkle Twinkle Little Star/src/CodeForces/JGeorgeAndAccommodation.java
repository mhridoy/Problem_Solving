package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class JGeorgeAndAccommodation {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_number_of_rooms = in.nextInt();
        int move=0;
        while (the_number_of_rooms--!=0)
        {
            int the_number_of_people_already_live=in.nextInt();
            int rooms_capacity = in.nextInt();
            if(the_number_of_people_already_live<rooms_capacity)move++;
        }
        out.println(move);
    }
}
