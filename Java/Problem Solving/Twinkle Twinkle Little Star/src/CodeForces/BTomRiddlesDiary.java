package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BTomRiddlesDiary {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int the_number_of_name= in.nextInt();
        String nameList[] = new String[the_number_of_name];
        for (int i = 0; i < the_number_of_name; i++) {
            nameList[i]= in.nextLine();
        }
        for (int i = 0; i <the_number_of_name ; i++) {
            boolean flag = false;
            if(i!=0) {
                for (int j = i-1; j >= 0; j--) {
                    if (nameList[i].equals(nameList[j]))
                        flag = true;
                }
            }
            if(i==0)
                out.println("NO");
           else if(flag)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
