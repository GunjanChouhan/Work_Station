package Company;

public class DSA_22_AssignmentQuestions {
    public static boolean Question1(int [] num){
        for (int i=0;i< num.length;i++){
            for (int j=i+1;j< num.length;j++){
                if (num[i] == num[j]){
                    return true ;
                }
            }
        }
        return false;
    }

    public static int Question2(int [] num){
        int buyprice=num[0];
        int profit =0;
        for (int i=1;i< num.length;i++){
            //buyprice=Math.min(buyprice,num[i]);
            if (buyprice<num[i]) {
                profit = Math.max(num[i]-buyprice,profit);
            }else {
                buyprice=num[i];
            }
        }
        return profit;
    }
    public static void triplets(int arr[]){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for (int k=j+1;k< arr.length;k++){
                    if (arr[i] + arr[j]+arr[k]==0) {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
    public static int trappedwater(int height[]){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for (int i=1;i< height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for (int i= height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int trappedwater=0;
        for (int i=0;i< height.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i] );
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,1};
        System.out.println(Question1(num));
        int prices[]={7,1,5,3,6,4};
        System.out.println(Question2(prices));

        int arr[]={-1,0,1,2,-1,-4};
        triplets(arr);

        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));

    }
}
