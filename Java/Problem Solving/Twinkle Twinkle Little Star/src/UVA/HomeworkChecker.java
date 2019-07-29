package UVA;

import Fast_IO.InputReader;


import java.io.PrintWriter;

public class HomeworkChecker {
    public void solve(int testNumber, InputReader in , PrintWriter out)  {
        int count=0;
        //out.println(count);
       while (in.hasNext()) {
           String line = in.next();
           if (line != null) {
               String Right_hand_Side[] = line.split("[=]");

               if (Right_hand_Side[1].equals("?")) continue;
               ;
               int ans = Integer.parseInt(Right_hand_Side[1]);
               String Left_Hand_Side_Minus[] = Right_hand_Side[0].split("[-]");
               if (Left_Hand_Side_Minus.length == 2) {
                   int a = Integer.parseInt(Left_Hand_Side_Minus[0]);
                   int b = Integer.parseInt(Left_Hand_Side_Minus[1]);
                   if (a - b == ans) count++;
               } else {
                   String Left_Hand_Side_Plus[] = Right_hand_Side[0].split("[\\+]");
                   int a = Integer.parseInt(Left_Hand_Side_Plus[0]);
                   int b = Integer.parseInt(Left_Hand_Side_Plus[1]);
                   if (a + b == ans) count++;
               }
              // out.println(count);
           }
           else break;

       }
        out.println(count);


    }
}
