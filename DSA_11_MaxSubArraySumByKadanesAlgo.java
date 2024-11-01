package Company;

public class DSA_11_MaxSubArraySumByKadanesAlgo {
    public static void MaxSubArraySum(int [] arr){
        int crr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            crr_sum+=arr[i];
            if(crr_sum<0){
                crr_sum=0;
            }
            max_sum=Math.max(crr_sum,max_sum);
        }
        System.out.println("our max subarray sum is : "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubArraySum(arr);
    }
}
