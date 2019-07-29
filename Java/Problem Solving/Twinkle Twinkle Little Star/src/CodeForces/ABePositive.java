package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ABePositive {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number_of_elements = in.nextInt();
        int array [] = new int[number_of_elements];
        int increment_plus =0;
        int increment_minus =0;
        for (int i = 0; i <number_of_elements ; i++) {
            array[i]=in.nextInt();
            if(array[i]>0)increment_plus++;
            else if(array[i]<0)increment_minus++;
        }
        int positive=0;
        if(number_of_elements%2==0)
         positive =(number_of_elements/2);
        else
            positive=(number_of_elements/2)+1;
         if(increment_plus <=increment_minus && (increment_minus>=positive))
             out.println("-1");
        else if((increment_plus>=increment_minus)&&(increment_plus>=positive) )
            out.println(1);

        else
            out.println(0);
        /*int positive = (number_of_elements/2)+1;
        int index=0;
        for (int i = 1; i <=1000 ; i++) {
            int increment=0;
            for (int j = 0; j <number_of_elements ; j++) {
                double ans = array[j]/i;
                if(ans>0)increment++;

            }
            if(positive==increment){
                index=i;
                break;
            }
        }*/
       // out.println(index);
    }
}
