package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ICPCIsComingInHot {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        int[] digitArray = new int[10];
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            digitArray[remainder]++;
            number = number / 10;
        }
        int max=0;
        int digggit=0;
        for (int counter = 0; counter < digitArray.length; counter++) {
            int digitCount = digitArray[counter];
            if (digitCount != 0 && digitCount>max) {
                max=digitCount;
                digggit=counter;
            }
        }

            out.println(digggit);

    }
}
