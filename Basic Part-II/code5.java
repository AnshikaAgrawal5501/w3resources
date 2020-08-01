//Write a Java program to print an array after changing the rows and columns of a given two-dimensional array

import java.io.*;
class code5
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter the no. of rows of the matrix");
        int m=Integer.parseInt (br.readLine());
        System.out.println ("Enter the no. of columns of the matrix");
        int n=Integer.parseInt (br.readLine());

        System.out.println ("Enter values in the 2-D matrix");
        int ar[][]=new int[n][n];

        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                ar[i][j]=Integer.parseInt (br.readLine());
            }
        }

        System.out.println ("Original Matrix -");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print (ar[i][j]+" ");
            }
            System.out.println ();
        }
        
        System.out.println ("Matrix after interchanging rows and columns -");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print (ar[j][i]+" ");
            }
            System.out.println ();
        }
    }
}