package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.*;

public class AASerialKiller {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String a = in.next(), b = in.next();
        int numbers_of_day = in.nextInt();
        String killed[] = new String[numbers_of_day];
        String replace[] = new String[numbers_of_day];
        for (int i = 0; i < numbers_of_day; i++) {
            killed[i] = in.next();
            replace[i] = in.next();

        }
        List asList = Arrays.asList(killed);
        Set<String> mySet = new HashSet<String>(asList);
        for(String s: mySet){

            System.out.println(s + " " + Collections.frequency(asList,s));

        }
    }
}
