//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

import java.io.*;
class code3
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no. in decimal form");
        double a=Double.parseDouble (br.readLine());
        double b=Double.parseDouble (br.readLine());
        

        if (a<1 && a>0 && b<1 && b>0)
            System.out.println ("true");
        else
            System.out.println ("false");
    }
}