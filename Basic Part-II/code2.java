// Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise

import java.io.*;
class code2
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter four no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        int c=Integer.parseInt (br.readLine());
        int d=Integer.parseInt (br.readLine());

        if (a==b && a==c && a==d)
            System.out.println ("all four numbers are equal");
        else
            System.out.println ("the four numbers are not equal");
    }
}