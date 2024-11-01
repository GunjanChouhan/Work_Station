package Company;

public class DSA_10_MaxSubArraySumByPrefixSum {
    public static void MaxSubArraySum(int [] arr){
        int crr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix []=new int[arr.length];

        prefix[0] =arr[0];
        for (int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){

                crr_sum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(max_sum<crr_sum){
                    max_sum=crr_sum;
                }
            }
        }
        System.out.println("Max sum = "+max_sum);
    }
    public static void main(String[] args) {
        int arr []={1,-2,6,-1,3};
        MaxSubArraySum(arr);
    }
}
