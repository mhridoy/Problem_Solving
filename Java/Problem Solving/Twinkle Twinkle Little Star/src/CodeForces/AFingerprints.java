package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AFingerprints {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_number_of_sequence = in.nextInt();
        int the_number_of_keys_= in.nextInt();
        int sequence [] = new int[the_number_of_sequence];
        int fingerprint [] = new int[the_number_of_keys_];
        for (int i = 0; i < the_number_of_sequence; i++) {
            sequence[i] = in.nextInt();
        }
        for (int i = 0; i <the_number_of_keys_ ; i++) {
            fingerprint[i]= in.nextInt();
        }
        ArrayList<Integer> secure = new ArrayList<>();
        for (int i = 0; i <the_number_of_sequence ; i++) {
            for (int j = 0; j <the_number_of_keys_ ; j++) {
                if(sequence[i]==fingerprint[j])
                    secure.add(sequence[i]);
            }
        }
        if(secure.isEmpty())
            out.println("");
        else
        {
            for (int i = 0; i <secure.size() ; i++) {
                if(i==secure.size()-1)
                    out.println(secure.get(i));
                else
                    out.print(secure.get(i)+" ");
            }
        }


    }
}
