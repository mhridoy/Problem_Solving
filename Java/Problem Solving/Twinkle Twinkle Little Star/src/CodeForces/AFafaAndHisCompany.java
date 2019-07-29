package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AFafaAndHisCompany {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int employee = in.nextInt();
        int team_leader=0;
            for(int i =1; i<=employee;i++)
            {
                if(employee%i==0 && i!=employee)
                    team_leader++;
            }


            out.println(team_leader);
    }
}
