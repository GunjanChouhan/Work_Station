package Company;

import java.util.Scanner;

public class DSA_23_CreationOf2DArray {
    public static boolean search(int matrix [][],int key ){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("Element found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void largestsmallest(int [] [] matrix){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]>largest){
                    largest=matrix[i][j];
                } else if (matrix[i][j]<smallest) {
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest element of this 2D Array is : "+largest);
        System.out.println("Smallest element of this 2D Array is : "+smallest);
    }
    public static void main(String args []){
        int matrix[][]=new int[3][3];
        int n= matrix.length, m= matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,7);
        largestsmallest(matrix);
    }
}
