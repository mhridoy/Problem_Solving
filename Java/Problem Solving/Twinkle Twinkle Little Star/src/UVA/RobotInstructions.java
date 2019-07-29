package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class RobotInstructions {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int test = in.nextInt();
       while(test --!=0)
       {
           int instruction = in.nextInt();
           ///in.nextLine();
           int array [] = new int[instruction];
           int p=0;
           for (int i = 0; i <instruction ; i++) {
               String line = in.nextLine();
               if(line.equals("LEFT"))
               {
                   p--;
                   array[i]=-1;
               }
               else if(line.equals("RIGHT"))
               {
                   p++;
                   array[i]=1;
               }
               else
               {
                   String temp ="";
                   for (int j = 0; j <line.length() ; j++) {
                       if(line.charAt(j)>=48 && line.charAt(j)<=57)temp+=line.charAt(j);
                   }
                   int x = Integer.parseInt(temp);
                   //out.println("x: "+x);
                   array[i]=array[x-1];
                   p+=array[i];

               }
           }
           out.println(p);
       }

    }
}
