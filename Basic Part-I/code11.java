//Write a Java program to print the area and perimeter of a circle.

import java.io.*;
class code11
{
    public static void main () throws IOException
    {
        InputStreamReader in =new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter radius of circle");
        int r=Integer.parseInt (br.readLine());

        double area=3.14*r*r;
        System.out.println ("Area of circle = "+area);
    }
}