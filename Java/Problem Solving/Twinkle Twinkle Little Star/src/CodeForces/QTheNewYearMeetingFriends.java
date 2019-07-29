package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class QTheNewYearMeetingFriends {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int friends_distance[]=new int[3];
        for(int i=0;i<3;++i){
            friends_distance[i]=in.nextInt();
        }
        Arrays.sort(friends_distance);
        out.println(friends_distance[2]-friends_distance[0]);
    }
}
