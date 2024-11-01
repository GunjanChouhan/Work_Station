package Company;

import java.util.Scanner;

public class CH_81_Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=87;
        marks[2]=76;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array index : ");
        int ind=sc.nextInt();
        System.out.println("Enter the number you want to divide the value with : ");
        int num =sc.nextInt();
        try{
            System.out.println("The value at Array index entered is: "+marks[ind]);
            System.out.println("THe value of Array value/number is : "+marks[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException exception occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException exception occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}
