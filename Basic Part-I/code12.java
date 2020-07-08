//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.io.*;
class code12
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter three no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        int c=Integer.parseInt (br.readLine());
        
        int sum=a+b+c;
        double av=sum/3;
        
        System.out.println ("average of three no. = "+av);
    }
}