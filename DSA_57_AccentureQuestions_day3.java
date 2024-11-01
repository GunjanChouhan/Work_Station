package Company;

import java.util.Scanner;

public class DSA_57_AccentureQuestions_day3 {
    public static int SumofOdd(int arr []){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2 !=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static int MakeSingleDigit(int a){
        if (a/10==0){
            return a;
        }
        if (a%2==0 && a/10!=0){
            return MakeSingleDigit((a-2)/2);
        }
        else{
            return MakeSingleDigit(a/2);
        }

    }
    public static int Highestpieceofcake(int n){
        return (n*(n+1)/2)+1;
    }
    public static int MostSupiriar(int arr []){
        int count=0;
        int supirear=-1;
        for (int i= arr.length-1;i>=0;i--){
            if (arr[i]>supirear){
                supirear=arr[i];
                count++;
            }
        }
        return count;
    }
    public static boolean PalindromeORnot(String str){
        if (str.length()%2==0){
            for (int i=0;i<str.length()/2;i++){
                if (str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
        } else if (str.length()%2!=0){
            for (int i=0;i<(str.length()+1)/2;i++){
                if (str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static int inversionPair(int []arr){
        int count=0;
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean ValidPassword(String a){
        int cp=0;
        int sm=0;
        if (a.length()<4){
            return false;
        }
        if (Character.isDigit(a.charAt(0))){
            return false;
        }
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)==' ' || a.charAt(i)=='/'){
                return false;
            }
            if(Character.isUpperCase(a.charAt(i))){
                cp++;
            }
            if (Character.isLowerCase(a.charAt(i))){
                sm++;
            }
        }
        return cp>0 && sm>0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        for (int i=0; i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(SumofOdd(arr));



//        int a=sc.nextInt();
//        System.out.println(MakeSingleDigit(a));


//        int n=sc.nextInt();
//        System.out.println(Highestpieceofcake(n));


//        System.out.print("Enter Size of Array : ");
//        int n= sc.nextInt();
//        int [] arr=new int[n];
//        System.out.print("Enter element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(MostSupiriar(arr));


//        String str=sc.next();
//        System.out.println(PalindromeORnot(str));



//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(inversionPair(arr));




        String str=sc.next();
        if (ValidPassword(str)){
            System.out.println("Valid Password!");
        }else {
            System.out.println("Not Valid Password!");
        }

    }
}
