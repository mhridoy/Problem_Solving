package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class EcologicalPremium {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int farmers = in.nextInt();
            int result=0;
            while (farmers--!=0) {
                int farmyard = in.nextInt();
                int animals = in.nextInt();
                int the_farmers_environment = in.nextInt();
                result+=farmyard*the_farmers_environment;
            }
            out.println(result);
        }
    }
}
