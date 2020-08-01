//Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false

import java.io.*;
class code4
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the size of the 2-D boolean matrix");
        int n=Integer.parseInt (br.readLine());

        System.out.println ("Enter values in the 2-D boolean matrix");
        boolean ar[][]=new boolean[n][n];

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                ar[i][j]=Boolean.parseBoolean (br.readLine());
            }
        }

        System.out.println ("2-D Boolean matrix is -");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (ar[i][j]==true)
                    System.out.print ("t");
                else
                    System.out.print ("f");
            }
            System.out.println ();
        }
    }
}