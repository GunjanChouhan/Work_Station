package Company;

import java.util.Scanner;

public class CH_79_ErrorsExceptions_Demo {
    public static void main(String[] args) {
        //Syntax Errors Demo
        //int a=0   ---->Error:no semicolon
        //b=9;      ---->b not declared!

        //Logicals Errors Demo
        //write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }


        //Runtime Error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 by k is "+ 1000/k);
    }
}
