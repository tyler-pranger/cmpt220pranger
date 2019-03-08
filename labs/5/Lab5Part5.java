package lab5;

import java.util.Scanner;

public class Lab5Part5 {
	private static Scanner sc;

	public static void main(String args[])
    {
        int row,col;
         
        sc = new Scanner(System.in);
         
        //Read number of rows and columns
        System.out.print("Input number of rows: ");
        row=sc.nextInt();
        System.out.print("Input number of columns: ");
        col=sc.nextInt();
         
        //declare two dimensional array (matrices)
        int a[][]=new int[row][col];
 
         
        //Read elements of Matrix a
        System.out.println("Enter elements of matrix a:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print("Element [" + (i+1) + "," + (j+1) + "]: ");
                a[i][j]=sc.nextInt();
            }
        }
         
        //print matrix a
        System.out.println("Matrix a:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
         
         
        //print matrix b
        System.out.println("::: Transpose Matrix ::: ");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(a[j][i] + "\t");
            }
            System.out.print("\n"); 
        }
         
    }   
}