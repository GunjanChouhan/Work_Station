package Company;

import java.util.Scanner;

public class DSA_39_Accenture_practice_Question {
    public static int getBMICategory(int weight,float height){
        double BMI=weight/(height*height);
        if (BMI<18){
            return 0;
        } else if (BMI>=18 && BMI<25) {
            return 1;
        } else if (BMI>=25 && BMI<30) {
            return 2;
        } else if (BMI>=30 && BMI<40) {
            return 3;
        } else  {
            return 4;
        }

    }

    public static int BalanceFruits(int a,int m,int rs){
        if (a>m){
            return (rs-(a-m));
        } else if (a<m) {
            return (rs-(m-a));
        }
        return rs;
    }

    public static int CountSpecificNumber(int m,int n){
        if (m>n){
            return -1;
        }
        int count=0;
        for (int i=m;i<=n;i++){
            if (hasOnlyValidDigits(i)){
                count++;
            }
        }
        return count;

    }
    public static boolean hasOnlyValidDigits(int number){

        String num=Integer.toString(number);
        for (char c:num.toCharArray()){
            if (c !='1' && c!='4' && c!='9'){
                return false;
            }
        }
        return true;
    }
    public static  int ratsQuestion(int arr [],int r,int unit){
        int food=0;
        int count=0;
        if (arr.length==0){
            return  -1;
        }
        for (int i=0;i<arr.length;i++){
            if (food<14){
                food +=arr[i];
                count++;
            }
        }
        if(food>14){
            return count;
        }
        else {
            return 0;
        }

    }
    public static void Wheelvehicle(int V,int W){
        if (2>W && W%2 != 0 && V>W){
            System.out.println("INVALID INPUT");
        }
        int TW=((V*4)-W)/2;
        int FW=V-TW;
        System.out.println("TW : "+TW);
        System.out.println("FW : "+FW);

    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);


              //QUESTION 1
//            System.out.print("Enter your weight in kilograms: ");
//            int weight = sc.nextInt();
//            System.out.print("Enter your height in meters: ");
//            float height = sc.nextFloat();
//
//            int category = getBMICategory(weight, height);
//            System.out.println("Your BMI category is: " + category);



//         //QUESTION 2
//        int a= sc.nextInt();
//        int m=sc.nextInt();
//        int rs=sc.nextInt();
//        int ruppes=BalanceFruits(a,m,rs);
//        System.out.println("Total ruppes left : "+ruppes);


          //QUESTION 3
//        System.out.println("Enter first number : ");
//        int m= sc.nextInt();
//        System.out.println("Enter second number : ");
//        int n=sc.nextInt();
//        System.out.println(CountSpecificNumber(m,n));

        //Question 4
//        int [] arr={2,8,3,5,7,4,1,2};
//        int r=7;
//        int unit=2;
//        System.out.println(ratsQuestion(arr,r,unit));

        //Question 5
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of vehicle : ");
        int V= sc.nextInt();
        System.out.print("Enter a number of wheels : ");
        int W=sc.nextInt();
        Wheelvehicle(V,W);


    }
}