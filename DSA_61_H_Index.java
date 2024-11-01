package Company;

import java.util.Arrays;

public class DSA_61_H_Index {
    public static int Hindexs(int [] arr){
        Arrays.sort(arr);
        System.out.println(arr.length);
        for(int i=0;i< arr.length;i++){
            if(arr[i]>= arr.length-i){
                return arr.length-i;

            }
        }
        return 0;
    }
    public static void main(String [] args){
        int arr [] ={8,3,11,90,31,34,12,21,3,9,8,43,20,19,71,61};
        System.out.println(Hindexs(arr));
    }
}
