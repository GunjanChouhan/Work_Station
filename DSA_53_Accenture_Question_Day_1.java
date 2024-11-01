package Company;

import java.util.Scanner;

public class DSA_53_Accenture_Question_Day_1 {
    public static int hourcount(int n,int [] arr){
        int count=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if ((arr[i]+arr[j]) % 60 == 0){
                    int q=(arr[i]+arr[j])/60;
                    count+=q;
                }
            }
        }
        return count;
    }

    public  static double areaofcircle(int r){
        double area = Math.PI * (r * r);
        return area;
    }

    public static int factorial(int r){
        int fact=1;
        for (int i=2;i<=r;i++){
            fact=fact*i;
        }
        return  fact;
    }

    public static int HCF(int a,int b){

        if (a==0){
            return  b;
        } else if (b==0) {
            return a;
        } else if (a>b) {
            return HCF(a-b,b);
        }
        else  {
            return HCF(a,b-a);
        }
    }
    public  static  int fLCM(int a,int b){
        int LCM=(a*b)/HCF(a,b);
        return  LCM;
    }

    public static int prime(int a,int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            int count=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return  sum;
    }
    public static void ordernumber(int a){
        if(a==0){
            return ;
        }
        ordernumber(a/10);
        System.out.print(a%10);
    }

    public static int  Armstrong(int a){
        int ld, sum = 0;
        int original = a;
        while ((a > 0)) {
            ld = a%10;
            a = a/10;
            sum = sum+(ld*ld*ld);
        }
        if(sum == original) {
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array : ");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        System.out.print("Enter element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(hourcount(n,arr));




//        Scanner sc = new Scanner(System.in);
//        int r= sc.nextInt();
//        System.out.println(areaofcircle(r));
//        System.out.println(factorial(r));




//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(HCF(a,b));
//        System.out.println(fLCM(a,b));





//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(prime(a,b));




        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        ordernumber(a);

//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        if (Armstrong(a)==1){
//            System.out.println("Armstrong");
//        }else {
//            System.out.println("not");
//        }
    }
}
