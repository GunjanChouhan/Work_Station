package Company;

public class DSA_13_Ps {
    public static int Linearsearch(int marks []){
        int key=77;
        for (int i=0;i< marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int Largestnumber(int marks[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;
    }
    public static void BinarySearch(int roll[]){
        int start=0;
        int end=roll.length;
        int mid;
        int key=11;
        while (start<end){
            mid=(start+end)/2;
            if(roll[mid]==key){
                System.out.println(mid);
            }
            if (roll[mid]>key) {
                end=mid-1;
            }
            else  {
                start=mid+1;
            }

        }
    }

    public static void ReverseArray(int roll[]){
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


    public static void Pairsinarray(int roll[]){
        int tp=0;
        for (int i=0;i< roll.length;i++){
            for (int j=i+1;j< roll.length;j++){
                System.out.print("("+roll[i]+","+roll[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs in this Array is : "+tp);
    }

    public static void SubArray(int roll[]){
        int ts=0;
        for (int i=0;i< roll.length;i++){
            for (int j=i;j< roll.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(k);

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array in this Array : "+ts);
    }

    public static void SubarraySum(int roll[]){
        int maxSum=Integer.MIN_VALUE;
        int CrrSum=0;
        for (int i=0;i< roll.length;i++){
            for (int j=i;j< roll.length;j++){
                CrrSum=0;
                for (int k=i;k<=j;k++){

                    CrrSum +=roll[k];
                }
                System.out.println("Current Sum"+CrrSum);

                if(maxSum<=CrrSum){
                    maxSum=CrrSum;
                }
            }
        }
        System.out.println("Maximum Sub Array in this Array : "+maxSum);
    }


    public static void prefixSum(int marks[]){
        int crrSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix []=new int [marks.length];
        prefix[0]=marks[0];
        for(int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1] + marks[i];
        }
        for(int i=0;i<marks.length;i++){
            for (int j =i;j< marks.length;j++){
                crrSum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxSum<crrSum){
                    maxSum=crrSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void kadanes(int k[]){
        int maxsum=Integer.MIN_VALUE;
        int crrsum=0;

        for (int i=0;i<k.length;i++){
            crrsum=crrsum+k[i];
            if(crrsum<0){
                crrsum=0;
            }
            maxsum=Math.max(crrsum,maxsum);
        }
        System.out.println("our max subarray sum is : " +maxsum);
    }


    public static int trappedWater(int [] height){
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for (int i=1;i< height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1] );
        }
        //calculate right max boundary --array
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i= height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trappedwater =0;
        for (int i=0;i< height.length;i++){
            //waterlevel=min(leftmax bound,rightmax bound)
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
//        int marks[]={67,54,93,77,39};
//        int index=Linearsearch(marks);
//        if(index==-1){
//            System.out.println("NOT FOUND");
//        }else {
//            System.out.println("Index of that key is : "+index);
//        }


//        System.out.println("Largest element in this Array is : "+Largestnumber(marks));


//        int roll[]={2,4,6,7,9,11,13};
//        BinarySearch(roll);
//        ReverseArray(roll);
//        for (int i=0;i< roll.length;i++){
//            System.out.print(roll[i]+" ");
//        }

//        Pairsinarray(roll);
//        SubArray(roll);

//        SubarraySum(roll);


//        int k[]={-2,-3,4,-1,-2,1,5,-3};
//        prefixSum(marks);
//        kadanes(k);

        int height [] ={4,2,0,6,3,2,5};
        System.out.println("Trraped water : "+trappedWater(height));
        }
        }
