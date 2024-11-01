package Company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DSA_18_InbuiltSort {
    public static void printarr(int arr []){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr ,0,3);
        printarr(arr);
    }
}
