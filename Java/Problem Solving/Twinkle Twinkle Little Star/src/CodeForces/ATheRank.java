package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ATheRank {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int number_of_students = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        int tomas=0;
        for (int i = 0; i < number_of_students; i++) {
            int eng = in.nextInt();
            int german = in.nextInt();
            int math = in.nextInt();
            int history = in.nextInt();
            array.add(eng+german+math+history);
            if(i==0)
                tomas=eng+german+math+history;
        }
        Collections.sort(array);
        int max=0;
        int count=0;
        for (int i = 0; i <number_of_students ; i++) {
            if(array.get(i)>tomas)
            {
                count++;
            }
        }
        out.println(count+1);
    }
}
