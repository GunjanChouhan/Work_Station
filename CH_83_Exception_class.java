package Company;

import java.util.Scanner;

class Myexception extends Exception{
    public String toString(){
        return  " I am to Strong";
    }
    public String getMessage(){
        return " I am getMessage";
    }
}
public class CH_83_Exception_class {
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<99){
            try{
                throw new Myexception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("yes Finished");
        }
    }
}
