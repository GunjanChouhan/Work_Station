package Company;

import java.util.Scanner;

public class DSA_55_TCSQuestions_Day2 {
    public static void targetQues(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("["+i+", "+j+"]");
                }
            }
        }
    }
    public static boolean SortedinNondecreasing(int [] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static int SumofAllElement(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void frequencyoffallelement(int arr[]){
        for (int i=0;i<arr.length;i++){
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    i++;
                }
            }
            System.out.print(arr[i] +":"+count+" ");
        }
    }
    public static void sortedArray(int arr []){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MoveZero(int [] arr){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                if (arr[i] == 0) {
                    temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void addElementinArray(int [] arr,int element){
        int Dub [] =new int[arr.length+1];
        for (int i=0;i<arr.length;i++){
            Dub[i]=arr[i];
        }
        Dub[arr.length]=element;
        for (int i=0;i< Dub.length;i++){
            System.out.print(Dub[i]+" ");
        }
    }
    public static boolean ContainsDuplicate(int arr []){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
//    public static boolean FindDuplicteinOnTimeAndO1Extra(int [] arr){
//        for (int i=0;i<arr.length+1;i++){
//
//        }
//    }

    public static void RightRotatedKtimes(int arr[],int k){
        int gcc[]=new int[arr.length];
        int e=0;
        for (int i=1;i<=k;i++){
            gcc[e]=arr[arr.length-i];
            e++;
        }
        for (int i=0;i< arr.length-k;i++){
            gcc[e]=arr[i];
            e++;
        }
        for (int i=0;i< gcc.length;i++){
            System.out.print(gcc[i]+" ");
        }
    }
    public static int SingleNumber(int [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]!=arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void MeanMedian(int arr []){
        int mean=0;
        int median=0;
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        mean=sum/2;
        if (arr.length%2!=0) {
            median = arr[(arr.length)/2];
        }else {
            median=(arr[(arr.length/2)]+arr[((arr.length/2)-1)])/2;
        }
        System.out.println("Mean : "+mean +","+"Median : "+median);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array : ");
//        int n= sc.nextInt();
//        int [] arr=new int[n];
//        System.out.print("Enter Element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.print("Enter your target");
//        int target=sc.nextInt();
//        targetQues(arr,target);




//        int arr[]={1,2,3,4,5};
//        System.out.println(SortedinNondecreasing(arr));




//        int arr[]={1,2,3,4};
//        System.out.println(SumofAllElement(arr));




//        int arr[]={1,2,2,3,3};
//        frequencyoffallelement(arr);




//        int arr[]={2,0,1,2,1,0};
//        sortedArray(arr);




//        int arr[] = {0,1,0,3,12};
//        MoveZero(arr);



//        int [] arr ={1,2,3};
//        int element=4;
//        addElementinArray(arr,element);



//        int [] arr = {1,2,3,1};
//        System.out.println(ContainsDuplicate(arr));




        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        RightRotatedKtimes(arr,k);



//        int [] arr={4,1,2,1,2};
//        System.out.println(SingleNumber(arr));




//        int [] arr={1,2,3,4,8,6,7,5};
//        MeanMedian(arr);
    }
}
