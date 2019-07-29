package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ContractRevision {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()) {
            String the_digit_that_has_failed = in.next();
            String the_number_that_was_originally_agreed = in.next();
            if(the_digit_that_has_failed.equals("0")&&the_number_that_was_originally_agreed.equals("0"))
                break;
            String temp = "";
            for (int i = 0; i < the_number_that_was_originally_agreed.length(); i++) {
                if (the_digit_that_has_failed.charAt(0) != the_number_that_was_originally_agreed.charAt(i))
                    temp += the_number_that_was_originally_agreed.charAt(i);
            }
            if(temp=="")out.println(0);
            else {
                if(temp.charAt(0)=='0')out.println(0);
                else
                out.println(temp);
            }
        }
    }
}
