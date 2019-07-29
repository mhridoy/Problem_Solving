package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AboveAverage {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();
        while(test_case-- !=0)
        {
            double the_number_of_people = in.nextDouble();
            double avg =0;
            double count_above_avg=0;
            double final_grade[] = new double[(int)the_number_of_people];
            for (int i = 0; i <the_number_of_people ; i++) {
                 final_grade[i] = in.nextDouble();
                avg+=final_grade[i];
            }
            avg/=the_number_of_people;
            for (double grade : final_grade ) {
                if(avg<grade)count_above_avg++;
            }
            double above_avg_percentage= (100*count_above_avg)/the_number_of_people;
            out.println(String.format("%.3f%%",above_avg_percentage));
        }
    }
}
