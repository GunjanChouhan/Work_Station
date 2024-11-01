package Company;

import java.util.Scanner;

public class DSA_38_Accenture_practice_Question {
    public static void nextgreatest(int [] roll){
        for (int i=0;i< roll.length;i++){
            boolean found=false;
           for (int j=i+1;j< roll.length;j++){
               if (roll[i]<roll[j]){
                   roll[i]=roll[j];
                   found =true;
                   break;
               }
           }
            if (found == false){
                roll[i]=-1;
           }
        }
        roll[roll.length-1] = -1;
    }
    public static void printf(int roll []){
        for (int i=0;i< roll.length;i++){
            System.out.print(roll[i]+" ");
        }
        System.out.println();
    }
    public static void sumofoddnumber(int array [],int n){
        int sum=0;
        for (int i=0;i<n;i++){
            if (array[i]%2 != 0){
                sum += array[i];
            }
        }
        System.out.println("Sum of all odd integer of this array is : "+sum);
    }
    public static void inversionpair(int array[],int n){
        int count=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (i<j && array[i]>array[j]){
                    //System.out.print("("+array[i]+","+array[j]+")");
                    count++;
                }
            }
        }
        //System.out.println();
        System.out.println("No of pairs : "+count);
    }


    public static void main(String[] args) {
//        int roll []={4,5,2,25};
//        nextgreatest(roll);
//        printf(roll);
//        int n=5;
//        int array [] ={1,20,6,4,5};
//        //sumofoddnumber(array,n);
//        inversionpair(array,n);


    }
}
