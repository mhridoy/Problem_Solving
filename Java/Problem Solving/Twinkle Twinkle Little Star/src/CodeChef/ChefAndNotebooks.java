package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ChefAndNotebooks {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();

        while (test_case--!=0)
        {
            int want_to_write_pages = in.nextInt();
            int His_note_book_pages = in.nextInt();
            int budget = in.nextInt();
            int notebooks_in_shops = in.nextInt();
            boolean check_his_luck=false;
            while (notebooks_in_shops--!=0)
            {
                int Pi = in.nextInt();
                int Ri = in.nextInt();
                if(His_note_book_pages+Pi>=want_to_write_pages && Ri<=budget)
                    check_his_luck=true;

            }
            if(check_his_luck)
                out.println("LuckyChef");
            else
                out.println("UnluckyChef");
        }
    }
}
