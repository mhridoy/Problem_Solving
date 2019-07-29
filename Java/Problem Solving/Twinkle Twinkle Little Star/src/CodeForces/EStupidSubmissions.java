package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class EStupidSubmissions {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long test = in.nextLong();
        while (test-- != 0) {
            long number_of_test_problem = in.nextLong();
            long number_of_submission = in.nextLong();
            long number_of_sample_test = in.nextLong();
            //in.nextLine();
            char array[] = new char[(int)number_of_test_problem+2];
            for (int i = 1; i <=number_of_test_problem; i++) {
                array[i] = in.next().charAt(0);
                //out.println(array[i]);
            }

            long range_of_see_test_case = number_of_sample_test;
            long count = 0;
            while (number_of_submission-- != 0) {
                char input = in.next().charAt(0);
                //out.println(input);
                if (input == 'A') range_of_see_test_case = number_of_test_problem;
                else {
                    long wrong_ans_test_case_on = in.nextLong();
                    //out.println(wrong_ans_test_case_on);
                    if (wrong_ans_test_case_on <= range_of_see_test_case && array[(int)wrong_ans_test_case_on] == 'S')
                        count++;
                    else if (wrong_ans_test_case_on > range_of_see_test_case)
                        range_of_see_test_case = wrong_ans_test_case_on;
                }
            }
            out.println(count );
        }
    }
}

