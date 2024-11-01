package Company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class CH_86_Ps {
    public static void main(String[] args) {
        //Question 1
        //int a=7     --->Syntax Error
//        int age=78;
//        int year_born = 2000-78;//Logical error
        //System.out.println(6/0); //Runtime error

        //Question 2
        try{
            int a=666/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println("Ha Ha");
        }
        catch (IllegalArgumentException e){
            System.out.println("He he");
        }

        //Question 3
        boolean flag=true;
            int [] marks =new int[3];
            marks[0]=87;
            marks[1]=75;
            marks[2]=90;
        Scanner sc =new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.print("Enter the value o index : ");
                    index = sc.nextInt();
                    System.out.println("The value of marks[index] is " + marks[index]);
                    break;
                }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
