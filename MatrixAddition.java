//Addition of Two matrix
//MatrixAddition.java
import java.io.*;
import java.util.*;
public class MatrixAddition
{
    public static void main(String args[])
    {
        int arr[][];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows: ");
    int r=sc.nextInt();
    System.out.println("Enter no of coloums: ");
    int p=sc.nextInt();
   int  a[][]=new int[r][p];
    int b[][]=new int[r][p];
    int c[][]=new int[r][p];
    System.out.println("Total no of elements in the matrix");
    System.out.println("Enter "+(r*p)+" elements into matrix A: ");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<p;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter "+r*p+" Elements into matrix B: ");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<p;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<p;j++)
        {
           c[i][j]= a[i][j]+b[i][j];
        }
    }
    System.out.print("The matrix is");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<p;j++)
        {
                System.out.println(c[i][j]+" ");
                System.out.println();
            }
        }
    }
}
