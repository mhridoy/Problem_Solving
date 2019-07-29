package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ISoldierAndBananas {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_cost_of_first_banana = in.nextInt();
        int number_of_dollors_soilder = in.nextInt();
        int want_to_buy = in.nextInt();
        long borrow_dollor = 0;
        for (int i = 1; i <=want_to_buy ; i++) {
            borrow_dollor+=the_cost_of_first_banana*i;
        }
        if(borrow_dollor<=number_of_dollors_soilder)
            out.println(0);
        else
        out.println(Math.max((borrow_dollor-number_of_dollors_soilder),(number_of_dollors_soilder-borrow_dollor)));
    }
}
