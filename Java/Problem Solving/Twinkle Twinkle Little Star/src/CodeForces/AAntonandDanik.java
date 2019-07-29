package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AAntonandDanik {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int num_of_games = in.nextInt();
        String won = in.nextLine();
        int anton =0,danik=0;
        for (int i = 0; i <won.length() ; i++) {
            if(won.charAt(i)=='A')anton++;
            else danik++;

        }
        if(danik==anton)out.println("Friendship");
        else if(anton<danik) out.println("Danik");
        else out.println("Anton");
    }
}
