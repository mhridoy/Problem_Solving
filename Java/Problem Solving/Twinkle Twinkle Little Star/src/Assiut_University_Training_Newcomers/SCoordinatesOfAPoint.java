package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SCoordinatesOfAPoint {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        if(a==0 && b==0)
            out.println("Origem");
        else if(a>1000 || -1000>a)
            out.println("Eixo X");
        else if(b>1000 || -1000>b)
            out.println("Eixo Y");
        else if(a>=0 && b>=0)
            out.println("Q1");
        else if(a<0 && b>=0)
            out.println("Q2");
        else if(a<0 && b<0)
            out.println("Q3");
        else if(a>=0 && b<0)
            out.println("Q4");

    }
}
