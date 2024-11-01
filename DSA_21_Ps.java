package Company;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;

public class DSA_21_Ps {
    public static void linearsearch(int marks[],int key){
        for (int i=0;i< marks.length;i++){
            if(marks[i] == key){
                System.out.println("Key value is found at index :"+i);
            }
        }
    }
    public static int largestnumber(int marks[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i< marks.length;i++){
            if (marks[i]>largest){
                largest=marks[i];
            }
        }
        return largest;
    }
    public static int binarysearch(int roll[]){
        int key=5;
        int start=0;
        int end= roll.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            if (roll[mid]==key){
                return mid;
            }
            if (roll[mid]<key){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int [] roll){
        int start=0;
        int end= roll.length-1;
        while (start<end){
            int temp=roll[start];
            roll[start]=roll[end];
            roll[end]=temp;
            start++;
            end--;
        }
    }
    public static void pairsINarray(int roll []){
        for (int i=0;i< roll.length;i++){
            //int crr=roll[i];
            for (int j=i+1;j< roll.length;j++){
                System.out.print("("+roll[i]+","+roll[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArray(int [] roll){
        int ts=0;
        for (int i=0;i< roll.length;i++){
            for (int j=i;j< roll.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(roll[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array : "+ts);
    }
    public static void MaxSubArraysumbruteforce(int roll[]){
        int max_sum=Integer.MIN_VALUE;
        int crr_sum=0;
        for (int i=0;i< roll.length;i++){
            for (int j=i;j< roll.length;j++){
                crr_sum=0;
                for (int k=i;k<=j;k++){
                    System.out.print(roll[k]);
                    crr_sum += roll[k];
                }
                System.out.print(" : "+crr_sum);
                if (crr_sum>max_sum){
                    max_sum=crr_sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum of this array is : "+max_sum);
    }

    public static void prifixsumofArray(int [] roll){
        int crr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[roll.length];
        prefix[0]=roll[0];
        for (int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+roll[i];
        }

        for (int i=0;i< roll.length;i++){
            for (int j=i;j< roll.length;j++){
                crr_sum= i ==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (max_sum<crr_sum){
                    max_sum=crr_sum;
                }
            }
        }
        System.out.println("Max sum by Prefix: "+max_sum);
    }

    public static void kadansAlgo(int [] roll){
        int crr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i< roll.length;i++){
            crr_sum +=roll[i];
            if (crr_sum<0){
                crr_sum = 0;
            }
            max_sum=Math.max(crr_sum,max_sum);
        }
        System.out.println("Max sum by Kadans algo : "+max_sum);
    }

    public static int trappingRain(int [] height){
        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for (int i=1;i< height.length;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        int right_max[]=new int[height.length];
        right_max[height.length-1]=height[height.length-1];
        for (int i= height.length-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        int trappedwater=0;
        for (int i=0;i<height.length;i++){
            int waterlevel = Math.min(left_max[i],right_max[i]);
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }
    public static int stockmarket(int [] stock){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<stock.length;i++){
            if (buyprice < stock[i]){
                int profit =stock[i]-buyprice;
                maxProfit =Math.max(maxProfit,profit);
            }else {
                buyprice = stock[i];
            }
        }
        return maxProfit;
    }
    public static void bubblesort(int bubble[]){
        for (int turn=0;turn< bubble.length-1;turn++){
            for (int j=0;j<bubble.length-1-turn;j++){
                if(bubble[j]>bubble[j+1]){
                    int temp=bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1]=temp;
                }
            }
        }
    }
    public static void selectiomsort(int arr []){
        for(int i=0;i<arr.length-1;i++){
            int minposition=i;
            for (int j=i+1;j< arr.length;j++){
                 if (arr[minposition]>arr[j]){
                     minposition=j;
                 }
            }
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int [] arr){
        for (int i=1;i<arr.length;i++){
            int crr=i;
            int prev=i-1;
            while (prev >= 0 && arr[prev] > arr[crr]){
                arr[prev + 1]=arr[prev];
                prev--;
            }
            arr[prev+1]=crr;
        }
    }
    public static void counting(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0;i< count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int bubble []){
        for (int i=0;i< bubble.length;i++){
            System.out.print(bubble[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int marks[]={67,89,56,39,90};
        int key=56;
        linearsearch(marks,key);
        System.out.println(largestnumber(marks));

        int roll[]={1,2,3,4,5,6};
        System.out.println(binarysearch(roll));

//        reverseArray(roll);
//        for (int i=0;i< roll.length;i++){
//            System.out.print(roll[i]+" ");
//        }
//        System.out.println();

        pairsINarray(roll);
        subArray(roll);
        MaxSubArraysumbruteforce(roll);
        prifixsumofArray(roll);
        kadansAlgo(roll);

        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water : "+trappingRain(height));

        int stock[]={5,3,7,9,2,7,5};
        System.out.println(stockmarket(stock));

        int bubble[]={5,4,1,3,2};
        bubblesort(bubble);
        print(bubble);

        int arr[]={5,4,1,3,2};
        selectiomsort(arr);
        print(arr);
//        insertionsort(arr);
//        print(arr);
        Arrays.sort(arr);
        print(arr);
        counting(arr);
        print(arr);
    }
}
