// Write a Java program to print the area and perimeter of a rectangle. 

import java.io.*;
class code13
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter length and breadth of the rectangle");
        int l=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        
        int area=l*b;
        
        System.out.println ("area of rectangle = "+area);
    }
}