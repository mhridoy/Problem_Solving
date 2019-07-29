package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class GradingStudents {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int students= in.nextInt();
        int marks[]= new int[students];
        for (int i = 0; i <students ; i++) {
            marks[i]= in.nextInt();
            if(marks[i]>=38) {
                int check = marks[i] % 10;
                if(check<5){
                    check=check-5;

                    if ( check < 3)
                        marks[i] += 2;
                }
                if (10 - check < 3)
                    marks[i] += 2;
            }
        }
        for (int i = 0; i <students ; i++) {
            out.println(marks[i]);
        }
    }
}
