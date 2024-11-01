package Company;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_52_Accenture_Question {
    public static int findvelocityatNthTimeRebound(int H,int v,int vn){
        int Hc=H*((v/vn)*v/vn);
        return Hc;
    }
    public static int SubStringWithAscii(String str1, String str2) {

        int maxcount = 0;
        String maxresult = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    int count = 0;
                    String result = "";
                    while (i < str1.length() && j < str2.length() && str1.charAt(i) == str2.charAt(j)) {
                        result += str1.charAt(i);
                        i++;
                        j++;
                        count++;
                    }
                    if (count > maxcount) {
                        maxcount = count;
                        maxresult = result;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < maxresult.length(); i++) {
            sum += (int) maxresult.charAt(i);
        }

        return sum;
    }
    public static int Question(int [] A,int n,int Q,int D,int R){
        int Divident=(D*Q)+R;
        int ans=-1;
        for (int i=0;i<n;i++){
            if (A[i]==Divident){
                 ans=i;
                 break;
            }
        }
        if (ans>=0){
            return ans;
        }
        else {
            return -1;
        }
    }

    public static int Candies(int n,int [] arr,int m){
        int candies=0;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if (arr[i]%5 == 0 ){
                candies++;
            }else if(m>arr[i]){
                m -=arr[i];
                candies++;
            }
        }
        if (candies>0){
            return  candies;
        }else {
            return -1;
        }
    }

    public static int ReverseSumEvenplace(int n,int[] arr){
        int rev[]=new int[n];
        for (int i=0;i<n;i++){
            rev[i]=arr[n-1-i];
        }
        int sum=0;
        sum += rev[0];
        for (int i=1;i< rev.length;i++){
            if(i%2==0) {
                sum += rev[i];
            }
        }
        return sum;
    }


    public static String PoetAndRhymes(String S,String [] D){
        String  ne=" ";
        int e=0;
        for (int i=0;i<D.length;i++){
            if (!S.equals(D[i])){
                if (S.length() > 4 && D[i].length()>4){
                    if (S.substring(S.length() - 3).equals(D[i].substring(D[i].length() - 3))) {
                        ne += S + " rhymes with " + D[i] + "\n";
                    }
                }
                else if (S.length() <= 4 && D[i].length()<=4){
                    if (S.substring(S.length() - 2).equals(D[i].substring(D[i].length() - 2))) {
                        ne += S + " rhymes with " + D[i] + "\n";
                    }
                }

            }
        }
        if (ne.length()>0) {
            return ne;
        }else {
            return "NO WORD";
        }
    }
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int H = sc.nextInt();
//        int v=sc.nextInt();
//        int vn=sc.nextInt();
//        System.out.println(findvelocityatNthTimeRebound(H,v,vn));




//        Scanner sc = new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2=sc.nextLine();
//        System.out.println(SubStringWithAscii(str1,str2));






//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of Array : ");
//        int n=sc.nextInt();
//        System.out.print("Enter the element of Array : ");
//        int [] A =new int[n];
//        for (int i=0;i<n;i++){
//            A[i]=sc.nextInt();
//        }
//        System.out.print("Quotient : ");
//        int Q = sc.nextInt();
//        System.out.print("Divisor : ");
//        int D= sc.nextInt();
//        System.out.print("Remainder : ");
//        int R=sc.nextInt();
//        System.out.println(Question(A,n,Q,D,R));
//





//        Scanner sc = new Scanner(System.in);
//        System.out.print("Length of Array : ");
//        int n=sc.nextInt();
//        System.out.print("Enter element of Array : ");
//        int arr [] = new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.print("Enter how much money bob have : ");
//        int m= sc.nextInt();
//        System.out.println(Candies(n,arr,m));






//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size od Array : ");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.print("Enter the element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(ReverseSumEvenplace(n,arr));





        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of string : ");
        int n=sc.nextInt();
        System.out.println("Enter your String : ");
        String S=sc.next();
        String [] D=new String[n];
        System.out.print("Enter element of Array : ");
        for (int i =0;i<n;i++){
            D[i]=sc.next();
        }
        System.out.println(PoetAndRhymes(S,D));
    }
}
