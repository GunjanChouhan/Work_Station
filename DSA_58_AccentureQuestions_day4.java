package Company;

import java.util.Scanner;

public class DSA_58_AccentureQuestions_day4 {
    public static int GatesQuestions(String str){
        int soln=str.charAt(0);
        for (int i=1;i<str.length()-1;i++){
            if (str.charAt(i)=='A'){
                soln = soln & str.charAt(i+1);
            }
            else if (str.charAt(i)=='B'){
                soln = soln | str.charAt(i+1);
            }else if(str.charAt(i)=='C'){
                soln = soln ^ str.charAt(i+1);
            }
        }
        return soln;
    }
    public static int PrimeNumberTillN(int n){
        int sum=0;
        for (int i=2;i<=n;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                sum+=i;
            }
        }
        return sum;
    }
    public static int SumofelementPrentInPrimeIndex(int arr []){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static String reverseString(String str){
        StringBuilder sc=new StringBuilder(" ");
        for (int i=str.length()-1;i>=0;i--){
            sc.append(str.charAt(i));
        }
        return sc.toString();
    }
    static String reverse(String s){
        String reverse=" ";
        for (int i=0;i<s.length();i++){
            reverse=s.charAt(i)+reverse;
        }
        return reverse;
    }
    static int PrimeIndex(int [] arr){
        int prime=0;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i % j ==0){
                    count++;
                }
            }
            if(count ==2){
                prime+=arr[i];
            }
        }
        return prime;
    }
    static void Fibbonacci(int num){
        int a=0;
        int b=1;
        int sum=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=3;i<=num;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
    static int Largest(int []arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (secondLargest<arr[i] && largest>arr[i]) {
                secondLargest=arr[i];

            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
//        String str="1A1B1C1";
//        System.out.println(GatesQuestions(str));


//        int n=11;
//        System.out.println(PrimeNumberTillN(n));


//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter size of array : ");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.print("Enter Array elements : ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(SumofelementPrentInPrimeIndex(arr));


//        String str="sumit";
//        System.out.println(reverse(str));


//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size");
//        int n=sc.nextInt();
//        int []arr=new int[n];
//
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(PrimeIndex(arr));
//        int n=sc.nextInt();
        //Fibbonacci(num);

        int []arr={10,20,64,50,8};
        System.out.println(Largest(arr));
    }
}
