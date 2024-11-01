package Company;

import java.util.Scanner;

public class DSA_28_String {
    public static void printletters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz@#1234");

        // String are IMMUTABLE
//        Scanner sc=new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);
        String FullName="Gunjan Kumar Chouhan";
        System.out.println(FullName.length());

        //concatenation
        String firstname="Gunjan";
        String lastname="Chouhan";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        //System.out.println(fullname.charAt(0));
        printletters(fullname);
    }
}
