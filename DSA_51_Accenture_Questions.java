package Company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class DSA_51_Accenture_Questions {
    public static int SquareShape(int arr[]){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if(Math.sqrt(arr[i])*Math.sqrt(arr[i])==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void maxelement(int arr[]){
        int max = Integer.MIN_VALUE;
        int index=-1;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Maximum element in this array is : "+max);
        System.out.println("Maximum element present at index : "+index);
    }
    public static int reverse(Integer num){
        StringBuilder sb=new StringBuilder();
        StringBuilder sc=new StringBuilder();
        num.toString();
        sb.append(num);
        for (int i=sb.length()-1;i>=0;i--){
            sc.append(sb.charAt(i));
        }
        return Integer.valueOf(sc.toString());
    }

    public static int numberofrats(int acc[],int r, int unit,int n ){
        int count =0;
        int food=0;
        if (acc.length==0 ){
            return  -1;
        }
        for (int i=0;i< acc.length;i++){
            if (food<=r*unit){
                food+=acc[i];
                count++;
            }
        }
        if (food<r*unit){
            return 0;
        }
        return count;
    }

    public static int practicequestion(int [] arr,int n){
        int [] EvenArray = new int[n+1/2];
        int [] OddArray = new int[n+1/2];
        int e=0;
        int o=0;
        for (int i=0;i<n;i++){
            if (i == 0 || i%2==0){
                EvenArray[e]=arr[i];
                e++;
            }
            else {
                    OddArray[o] = arr[i];
                    o++;
            }
        }
        Arrays.sort(EvenArray);
        Arrays.sort(OddArray);

    int Elargest = Integer.MIN_VALUE;
    int Esecondlargest=0;
    for (int i=0;i<EvenArray.length;i++){
        if (Elargest<EvenArray[i]){
            Esecondlargest=Elargest;
            Elargest=EvenArray[i];
         }
    }

    int Olargest = Integer.MIN_VALUE;
    int Osecondlargest=0;
    for (int i=0;i<OddArray.length;i++){
        if (Olargest<OddArray[i]){
            Osecondlargest=Olargest;
            Olargest=OddArray[i];
        }
    }
    int sum=Esecondlargest+Osecondlargest;
    return sum;
    }
    static int findMax(int arr[]){
        int ans=Integer.MIN_VALUE;
        int ansidx=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans=arr[i];
                ansidx=i;
            }
        }
        return ansidx;
    }

    public static int passwordQuestion(String str,int n){
        if (n<4){
            return 0;
        }
        if (str.charAt(0)>='0' && str.charAt(0) <='9'){
            return 0;
        }
        int num=0,cap=0;
        for (int i=0;i<n;i++){
            if (str.charAt(i)== ' ' || str.charAt(i) == '/'){
                return 0;
            }
            if (str.charAt(i) >='A' && str.charAt(i) <= 'Z' ){
                cap++;
            }
            if (str.charAt(i) >='0' && str.charAt(i) <= '9' ){
                num++;
            }
        }
        if (cap > 0 && num > 0){
            return 1;
        }
        else {
            return 0;
        }

    }

    public static int findcount(int [] arr,int length,int num,int diff){
        int count=0;
        for (int i=0;i<length;i++){
            if(arr[i] == num){
                count++;
            }
            if (arr[i] <=num && arr[i] >= num-diff){
                count++;
            }
        }
        return  count > 0 ? count : -1;
    }

    public static int differenceofSum(int n,int m){
        int divisibleSum=0;
        int notdivisibleSum=0;
        for (int i=1;i<=m;i++){
                if (i%n == 0){
                    divisibleSum +=i;
                }else {
                    notdivisibleSum +=i;
                }
        }

        return notdivisibleSum-divisibleSum;
    }

    public static int LargeSmall(int [] arr){

        if(arr.length == 0 || arr.length<=3){
            return 0;
        }
        int [] Oddplace  =new int [arr.length / 2];
        int [] Evenplace =new int [(arr.length+1) /2];
        int e=0;
        int o=0;

        for (int i=0;i< arr.length;i++){
            if (i % 2 == 0 || i == 0){
                Evenplace[e]=arr[i];
                e++;
            }else {
                Oddplace[o] = arr[i];
                o++;
            }
        }

        int Evenlargest=Integer.MIN_VALUE;
        int EvenSecondlargest=Integer.MIN_VALUE;
        for (int i=0;i<Evenplace.length;i++){
            if (Evenplace[i] > Evenlargest){
                EvenSecondlargest=Evenlargest;
                Evenlargest = Evenplace[i];
            }
            else if (Evenplace[i] > EvenSecondlargest && Evenplace[i] != Evenlargest) {
                EvenSecondlargest=Evenplace[i];
            }
        }

        int Oddsmallest = Integer.MAX_VALUE;
        int OddSecondsmallest = Integer.MAX_VALUE;
        for (int i=0;i<Oddplace.length;i++){
            if (Oddplace[i]<Oddsmallest){
                OddSecondsmallest=Oddsmallest;
                Oddsmallest=Oddplace[i];
            } else if (Oddplace[i] < OddSecondsmallest  &&  Oddplace[i] != Oddsmallest) {
                OddSecondsmallest=Oddplace[i];
            }
        }

    return EvenSecondlargest+OddSecondsmallest;
    }
    public static int ProductSmallestSum(int arr [],int n,int sum){
        if (n<2){
            return -1;
        }
        int smallest=Integer.MAX_VALUE;
        int SecondSmallest=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<smallest){
                SecondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]<SecondSmallest && arr[i] != smallest) {
                SecondSmallest=arr[i];
            }
        }
        if (smallest+SecondSmallest <= sum){
            return smallest*SecondSmallest;
        }else {
            return 0;
        }
    }
    public static String answer(int n,int num) {
        StringBuilder str = new StringBuilder(" ");
        while (num > 0) {
            int rem = num % n;
            if (rem > 9) {
                rem -= 9;
                char c = (char) ('A' + (rem - 1));
                str.append(c);
            } else {
                str.append(rem);
            }
            num /= n;
        }
        return str.reverse().toString();
    }

    public static String MoveHyphen(String str ){
        if(str == null){
            return null;
        }
        StringBuilder sb=new StringBuilder(" ");
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)== '-'){
                sb.append(str.charAt(i));
            }
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) != '-'){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int NumbersOfCarries(Integer num1,Integer num2){
        int carries=0;
        int carry=0;

        while(num1>0 || num2>0){
             int digit1=num1%10;
             int digit2=num2%10;

             int sum=digit1+digit2+carry;
            if (sum>=10){
                carries++;
                carry=1;
            }
            else{
                carry=0;
            }

            num1/=10;
            num2/=10;
        }
        return carries;
    }

    public static void ReplaceCharacter(String str,char ch1,char ch2 ){
        if(str.length()>=0){
            System.out.println("Null");
        }
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != ch1 || str.charAt(i) != ch2){
                count++;
            }
        }
        if (count ==0 || ch1==ch2){
            System.out.println("The string unchanged");
        }
        StringBuilder ga= new StringBuilder(" ");
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) ==ch1){
                ga.append(ch2);
            }
            else if (str.charAt(i) == ch2){
                ga.append(ch1);
            }else {
                ga.append(str.charAt(i));
            }
        }
        String st = ga.toString();
        System.out.println(st);
    }

    public static int OperationChoice(int C,int A,int B){
        if (C==1){
            return A+B;
        } else if (C==2) {
            return A-B;
        } else if (C==3) {
            return A*B;
        } else if (C==4) {
            return A/B;
        }else {
            return 0;
        }
    }

    ////////////////////////////////////
    public static int count(int i){
        int count=0;
        while (i%2==0 && i!=0){
            count++;
            i=i/2;
        }
        return count;
    }
    public static int MaxExponents(int a,int b){
        int Max=0;
        int num=0;
        for (int i=a;i<=b;i++){
            int temp=count(i);
            if(temp>Max){
                Max= temp;
                num=i;
            }
        }
        return  num;
    }


    public static int Calculate(int m,int n){
        int sum=0;
        for (int i=m;i<=n;i++){
            if (i%3==0 && i%5==0){
                sum +=i;
            }
        }
        return  sum;
    }

    public static int evenOddSum(int n,int [] matrix){
        int even [] = new int[(n+1)/2];
        int e=0;
        int odd [] = new int[n/2];
        int o=0;
        for (int i=0;i<n;i++){
            if (i%2==0 || i==0){
                even[e]=matrix[i];
                e++;
            }else {
                odd[o] = matrix[i];
                o++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int evenSecondlargest = even.length>1 ? even[even.length-2] : Integer.MIN_VALUE;
        int oddSecondlargest = odd.length>1 ? odd[odd.length-2] : Integer.MIN_VALUE;
        return evenSecondlargest+oddSecondlargest;
    }
    public static int display(int a){
        int sum=0;
        for (int i=1;i<=10;i++){
            System.out.println(a*i);
            sum += a*i;
        }
        return sum;
    }


//    public static int pallindrome(int a,int b){
//        for (int i=a;i<=b;i++){
//            String str =Integer.toString(i);
//            for (int j=0;j<str.length()+1/2;j++){
//                if ()
//            }
//        }
//    }




    public static void main(String[] args) {
//        int arr[]={64,16,38,81,50,100};
//        System.out.println(SquareShape(arr));
//        maxelement(arr);
//
//        Integer num=1234;
//        System.out.println(reverse(num));






//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter number of size : ");
//        int n= sc.nextInt();
//        int acc[]=new int[n];
//        System.out.print("Enter the elements of Array : ");
//        for (int i=0;i<n;i++){
//            acc[i]=sc.nextInt();
//        }
//        System.out.println("Enter number of rats present : ");
//        int r=sc.nextInt();
//
//        System.out.println("Enter food consume by 1 rat : ");
//        int unit=sc.nextInt();
//
//        System.out.println(numberofrats(acc,r,unit,n));







//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of the array : ");
//        int n = sc.nextInt();
//        int arr []=new int[n];
//        System.out.print("Enter the elements of the array : ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(practicequestion(arr,n));






//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of password : ");
//        int n = sc.nextInt();
//
//        //String str [] =new String[n];
//        System.out.print("Enter your password : ");
//        String str = sc.next();
//
//
//        System.out.println(passwordQuestion(str,n));







//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter length of array : ");
//        int length =sc.nextInt();
//
//        int arr []=new int[length];
//
//        System.out.println("Enter the element off Array : ");
//        for (int i=0;i<length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        System.out.println("Enter num : ");
//        int num=sc.nextInt();
//
//        System.out.println("Enter diff :");
//        int diff=sc.nextInt();
//
//        System.out.println(findcount(arr,length,num,diff));









//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of n : ");
//        int n = sc.nextInt();
//        System.out.print("Enter the value of m : ");
//        int m = sc.nextInt();
//        System.out.println(differenceofSum(n,m));






//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter length of Array : ");
//        int length=sc.nextInt();
//
//        int arr [] =new int [length];
//        System.out.print("Enter the element of Array : ");
//        for (int i=0;i<length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(LargeSmall(arr));







//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of array : ");
//        int n=sc.nextInt();
//
//        int arr[]=new int[n];
//        System.out.print("Enter elements of array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        System.out.print("Enter your sum : ");
//        int sum = sc.nextInt();
//
//        System.out.println(ProductSmallestSum(arr,n,sum));







//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int num= sc.nextInt();
//        System.out.println(answer(n,num));






//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your String : ");
//
//        String str=sc.nextLine();
//
//        System.out.println("Modified String : "+MoveHyphen(str));





//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1 : ");
//        Integer num1=sc.nextInt();
//        System.out.print("Enter num2 : ");
//        Integer num2=sc.nextInt();
//        System.out.println(NumbersOfCarries(num1,num2));





//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your String : ");
//        String str = sc.nextLine();
//        System.out.print("Enter character 1 :");
//        char ch1=sc.next().charAt(0);
//        System.out.print("Enter character 2 :");
//        char ch2=sc.next().charAt(0);
//        ReplaceCharacter(str,ch1,ch2);





//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of A : ");
//        int A = sc.nextInt();
//        System.out.print("Enter the value of B : ");
//        int B = sc.nextInt();
//        System.out.print("Enter the value of C : ");
//        int C= sc.nextInt();
//        System.out.println(OperationChoice(C,A,B));






//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number : ");
//        int a=sc.nextInt();
//        System.out.println("Enter 2nd number : ");
//        int b=sc.nextInt();
//        System.out.println(MaxExponents(a,b));




//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number : ");
//        int m=sc.nextInt();
//        System.out.println("Enter 2nd number : ");
//        int n=sc.nextInt();
//        System.out.println(Calculate(m,n));



//        Scanner sc  = new Scanner(System.in);
//        System.out.print("Enter Size of Matrix :");
//        int n=sc.nextInt();
//        int [] matrix=new int[n];
//        System.out.println("Enter element of Array : ");
//        for (int i=0;i<n;i++){
//            matrix [i]=sc.nextInt();
//        }
//        System.out.println(evenOddSum(n,matrix));




//        int a=5;
//        System.out.println(display(a));



//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Lower limit : ");
//        int a= sc.nextInt();
//        System.out.println("Enter Upper limit : ");
//        int b= sc.nextInt();



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String n=sc.next();

    }
}
