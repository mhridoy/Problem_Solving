package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AChangeInThermalUnit {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while (test-- !=0)
        {
            double Celsious = in.nextDouble();
            double Fahrenheit = in.nextDouble();
            //out.println(convertfahrenheit(Celsious));
            double convert_fahrenheit = convertfahrenheit(Celsious)+Fahrenheit;
            //out.println(convert_fahrenheit);
            double ans = convertcelsious(convert_fahrenheit);

                out.println(String.format("Case %d: %.2f",++index,ans));



        }
    }

    private double convertfahrenheit(double celsius) {
        double ans = celsius*1.8;
        return ans+32;
    }

    private double convertcelsious(double fahrenheit) {
        return ((fahrenheit-32)*5/9);


    }
}
