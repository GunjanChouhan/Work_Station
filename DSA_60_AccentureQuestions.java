package Company;
import java.util.*;
public class DSA_60_AccentureQuestions {
    public static int kadansalgo(int arr []){
        int crrSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            crrSum+=arr[i];
            if (crrSum<0){
                crrSum=0;
            }
            maxSum=Math.max(maxSum,crrSum);
        }
        return maxSum;
    }

    public static int prifixsum(int arr []){
        int crrSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix []=new int[arr.length];

        prefix[0]=arr[0];
        for (int i=1;i< arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                crrSum= i==0 ? prefix[j] :  prefix[j]-prefix[i-1];
                if (crrSum>maxSum){
                    maxSum=crrSum;
                }
            }
        }
        return maxSum;
    }
    public static void  fibonacii(int n){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int c;
        for (int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static int reverse(int n){
        int rev=0;
        while (n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static String reversestring(String str){
        String rev=" ";
        for (int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
    public static int [] reverseArray(int [] arr){
        int [] reversearr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            reversearr[i]=arr[arr.length-1-i];
            System.out.print(reversearr[i]);
        }
        return reversearr;
    }
    public static void main(String[] args) {
//        int []arr={2,-4,5,-6,10,2,-7};
//        System.out.println(kadansalgo(arr));
//        System.out.println(prifixsum(arr));
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        fibonacii(n);
        System.out.println();
        System.out.println(reverse(n));
        String str="Gunjan";
        System.out.println(reversestring(str));
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(reverseArray(arr));
    }
}
