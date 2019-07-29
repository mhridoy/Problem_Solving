package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CopsAndTheThiefDevu {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();
        while (test_case--!=0) {
            int number_of_houses = in.nextInt();
            int maximum_speed = in.nextInt();
            int maximum_search = in.nextInt();
            int cover = maximum_search*maximum_speed;
            int leaving_house = 0;
            int from=0;
            int to =0;
            for (int i = 0; i <number_of_houses ; i++) {
                int house = in.nextInt();
                if(i>0 && house>from)
                 from = house-cover;
                else if(i>0 && house<from)
                    from =cover-house;
                house+=cover;
                 to = house;
                out.println("From : "+from+" To : "+to);
                if(i>0)
                {
                    leaving_house+=to-from;
                    out.println(leaving_house);
                }



            }
            out.println(leaving_house);

        }
    }
}
