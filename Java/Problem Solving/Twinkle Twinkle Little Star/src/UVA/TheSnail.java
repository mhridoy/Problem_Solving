package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class TheSnail {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while(in.hasNext())
        {
            int hight_of_wall_feet= in.nextInt();
            int distance_climbed = in.nextInt();
            int snail_slide_down = in.nextInt();
            int fatigue_factor = in.nextInt();
            if(hight_of_wall_feet==0)break;
            double Hight_After_climbing =0.00;
            double distance = distance_climbed;
            double sliding = snail_slide_down;
            double Factor = (distance_climbed*(fatigue_factor/100.00));
            int Day =0;
            while(true )
            {
                Day++;
                Hight_After_climbing+=distance;
               // out.println("Intial Height : "+initial_height);
                //out.println("Distance Climb :"+Distance_Climb);
                //out.println("Height After Climb : "+Hight_After_climbing);
                //out.println("Height After Sliding : "+Hight_After_sliding);
                //out.println("Day :"+Day);
                    if(Hight_After_climbing>hight_of_wall_feet) {
                        out.println(String.format("success on day %d", Day));
                        break;
                    }
                    Hight_After_climbing-=sliding;
                    if ( Hight_After_climbing<0){
                out.println(String.format("failure on day %d",Day));
                break;
            }
                    distance-=Factor;
                            if(distance<0)distance=0;
            }




        }
    }
}
