package Company;

import java.util.Scanner;

public class CH_82_Nested_TryCatch {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=89;
        marks[1]=56;
        marks[2]=98;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.print("Enter the value of index : ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does noy exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
