package Company;
//BruteForce
public class DSA_9_MaxSubArraySumByBruteForce {
    public static void MaxSubArray(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int crr_sum=0;
        for (int i=0;i< arr.length;i++){
            for(int j=i;j<arr.length;j++){
                crr_sum=0;
                for (int k=i;k<=j;k++){
                    crr_sum +=arr[k];
                }
                System.out.println(crr_sum);

                if (max_sum<=crr_sum) {
                    max_sum=crr_sum;
                }
            }
        }
        System.out.println("Maximum sum of sub Array is : "+ max_sum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        MaxSubArray(arr);
    }
}
