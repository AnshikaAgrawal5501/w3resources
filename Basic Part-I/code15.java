//Write a Java program to swap two variables.

import java.io.*;
class code15
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        
        System.out.println ("Original values : ");
        System.out.println ("a = "+a+", b = "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println ("Values after Swapping : ");
        System.out.println ("a = "+a+", b = "+b);
    }
}