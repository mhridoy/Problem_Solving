package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AMiddleOfTheContest {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String hours_minuteStarting = in.nextLine();
        String hours_minutesFinishing = in.nextLine();
        String temp1[] = hours_minuteStarting.split(":");
        String temp2[] = hours_minutesFinishing.split(":");
        int hour_start = Integer.parseInt(temp1[0]);
        int hour_finish = Integer.parseInt(temp2[0]);
        int minute_start = Integer.parseInt(temp1[1]);
        int minute_finish = Integer.parseInt(temp2[1]);
        int difference_hour = Math.abs(hour_start - hour_finish);
        int total_hour = hour_start + hour_finish;
        int total_minute = minute_start + minute_finish;
        if(hour_start==hour_finish && minute_finish==minute_start)
            out.println("00:00");
        else if (total_minute == 0) {
            int total = 30;
            if (countNumber((total_hour / 2)) == 1 &&difference_hour==1)

                    out.println("0" + total_hour / 2 + ":30");
            else if(difference_hour==1)
                    out.println(total_hour / 2 + ":30");
            else
                out.println(total_hour/2+":00");

        }
        else if (countNumber((total_hour / 2)) == 1) {
                if (countNumber((total_minute / 2)) == 1) {
                    out.println("0" + total_hour / 2 + ":0" + total_minute / 2);
                } else
                    out.println(total_hour / 2 + ":" + total_minute / 2);
            } else {
                if (countNumber((total_minute / 2)) == 1) {
                    out.println(total_hour / 2 + ":0" + total_minute / 2);
                } else
                    out.println(total_hour / 2 + ":" + total_minute / 2);
            }


        }

        int countNumber ( int total_minute){
            int count = 0;

            while (total_minute != 0) {
                int rem = total_minute % 10;
                total_minute /= 10;
                count++;

            }
            return count;
        }

    }

