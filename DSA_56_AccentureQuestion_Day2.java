package Company;
import java.util.*;
public class DSA_56_AccentureQuestion_Day2 {
    public static double AreaOfCircle(int r){
        double area=Math.PI*(r*r);
        return area;
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }
    public static int HCF(int a,int b){
        if (a==0){
            return b;
        } else if (b==0) {
            return a;
        } else if (a>b) {
            return HCF(a-b,b);
        } else {
            return HCF(a,b-a);
        }
    }
    public static int LCM(int a,int b){
        return (a*b)/HCF(a,b);
    }
    public static boolean primeNumber(int a){
        if (a<=0){
            return false;
        }
        for (int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void CountPrimeNUmberinRange(int a,int b){
        int sum =0;
        for (int i=a;i<=b;i++){
            int count=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.println(i+" ");
            }
        }
    }
    public static int SumofDigitOFPrimeNumber(int a,int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            int count=0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count ==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void ordernumber(int a){
        if(a==0){
            return ;
        }
        ordernumber(a/10);
        System.out.print(a%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter radius of circle : ");
//        int r=sc.nextInt();
//        System.out.println(AreaOfCircle(r));


//        System.out.print("Enter your Number : ");
//        int n= sc.nextInt();
//        System.out.println(factorial(n));




//        System.out.print("Enter your Number : ");
//        int a= sc.nextInt();
//        System.out.print("Enter your Number : ");
//        int b= sc.nextInt();
//        System.out.println(HCF(a,b));
//        System.out.println(LCM(a,b));




//        System.out.print("Enter your Number : ");
//        int a= sc.nextInt();
//        System.out.println(primeNumber(a));
//        System.out.print("Enter your Number : ");
//        int b= sc.nextInt();
//        CountPrimeNUmberinRange(a,b);
//        System.out.println(SumofDigitOFPrimeNumber(a,b));


        System.out.println("Enter your number : ");
        int n=sc.nextInt();
        ordernumber(n);
    }
}
