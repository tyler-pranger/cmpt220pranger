package lab5;

import java.util.Scanner;

public class Lab5Part7 {
	    private static Scanner scanner;

		public static void main(String args[]) {
	        int row, col;
	        boolean isUpperTriangular = true;
	        // Ask the user for the number of rows and columns
	        scanner = new Scanner(System.in);
	        System.out.println("Enter total number of rows : ");
	        row = scanner.nextInt();
	        
	        System.out.println("Enter total number of columns : ");
	        col = scanner.nextInt();
	        
	        int inputArray[][] = new int[row][col];
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
	                inputArray[i][j] = scanner.nextInt();
	            }
	        }
	        
	        System.out.println("You have entered : ");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(inputArray[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < i; j++) {
	                if (inputArray[i][j] != 0) {
	                    isUpperTriangular = false;
	                    break;
	                }
	            }
	            if (!isUpperTriangular) {
	                break;
	            }
	        }
	        
	        if(isUpperTriangular){
	            System.out.println("This is an upper triangular matrix.");
	        }else{
	            System.out.println("This is not an Upper triangular matrix.");
	        }
	    }
	}

