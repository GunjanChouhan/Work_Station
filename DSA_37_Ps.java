package Company;

public class DSA_37_Ps {
    public static void search(int arr [],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("Element found at : "+i);
            }
        }
    }
    public static int largest(int arr []){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int binary(int num [],int point){
        int start=0;
        int end= num.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (point==num[mid]){
                return mid;
            }
            else if (point>num[mid]){
                start =mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int arr[]){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void printarray(int arr []){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void pairsINarray(int arr []){
        int tp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);
    }
    public static void subarray(int arr [ ]){
        int ts=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j< arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total sub array : "+ts);
    }

    public static void maxSubArraySum(int arr []){
        int maxsum=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int crrsum=0;
                for (int k=i;k<=j;k++){
                    crrsum+=arr[k];
                    if (maxsum<crrsum){
                        maxsum=crrsum;
                    }
                    System.out.print(arr[k]+" ");
                }
                System.out.println(":"+crrsum);
            }
        }
        System.out.println("Maximum sum of this sub arrays are : "+maxsum);
    }
    public static void MaxsubArraySumByPrefixSum(int arr []){
        int maxsum=Integer.MIN_VALUE;
        int crrsum=0;
        int prifix []=new int [arr.length];

        prifix[0]=arr[0];
        for (int i=1;i< prifix.length;i++){
            prifix[i]=prifix[i-1]+arr[i];
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i;j< arr.length;j++){
                crrsum=i==0 ? prifix[j] : prifix[j]-prifix[i-1];
                if (maxsum<crrsum){
                    maxsum=crrsum;
                }
            }
        }
        System.out.println("Max sum : "+maxsum);
    }
    public static void MaxSubarraySumBYKadanesalgo(int arr []){
        int crrsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            crrsum+=arr[i];

            if (crrsum<0){
                crrsum=0;
            }
            maxsum=Math.max(crrsum,maxsum);
        }
        System.out.println("Maximum sum of this array : "+maxsum);
    }
    public static int trappingRainWater(int height []){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for (int i=1;i< height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i] );
        }

        int Rightmax[]=new int[height.length];
        Rightmax[height.length-1]=height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            Rightmax[i]=Math.max(Rightmax[i+1],height[i] );
        }

        int trappedwater=0;
        for (int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i],Rightmax[i]);
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void BuySellStocks(int height []){
        int buy=Integer.MAX_VALUE;
        int MaxProfit=0;
        for (int i=0;i< height.length;i++){
            if (buy>height[i]){
                buy=height[i];
            }
            else if (buy<height[i]) {
                int profit = height[i]-buy;
                MaxProfit=Math.max(profit,MaxProfit);
            }
        }
        System.out.println("Total Profit : "+MaxProfit);
    }
    public static int Secondlargest(int height []){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for (int i=0;i< height.length;i++){
            if (height[i]>largest){
                secondlargest=largest;
                largest=height[i];
            } else if (height[i]>secondlargest && height[i] != largest) {
                secondlargest=height[i];
            }
        }
        return secondlargest;
    }

    public static void search(int num[][],int key){
        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[0].length;j++){
                if (key == num[i][j]){
                    System.out.println("Element found at : "+i+","+j);
                    break;
                }
            }
        }
    }
    public static void largestsmallest(int num [][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[0].length;j++){
                if (largest<num[i][j]){
                    largest=num[i][j];
                }
                else if (smallest>num[i][j]){
                    smallest=num[i][j];
                }
            }
        }
        System.out.println("Largest : "+largest );
        System.out.println("Smallest : "+smallest);
    }

    public static void printSpiralMatrix(int [][] matrix){
        int startRow=0;
        int startcol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while (startRow <= endRow && startcol <= endCol){
            for (int j=startcol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for (int j=endCol-1;j>=startcol;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startcol==endCol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static int DiagonalMatrix(int matrix [] []){
        int sum=0;
//        for (int i=0;i<matrix.length;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum += matrix[i][j];
//                } else if (i+j== matrix.length-1) {
//                    sum+=matrix[i][j];
//                }
//            }
//        }
        for (int i=0;i< matrix.length;i++){
            sum +=matrix[i][i];
            if (i!=matrix.length-1-i){
                sum+= matrix[i] [matrix.length-i-1];
            }
        }
        return sum;
    }
    public static boolean searchIN2D(int matrix [][]){
        int key=7;
        int row=0;
        int col=matrix[0].length-1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
                System.out.println("Found key at ("+row+","+col+")");
                return  true;
            } else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static boolean palindrome(String name){
        for (int i=0;i<name.length()/2;i++){
            if (name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float shortestpath(String path){
        int x=0;
        int y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if (dir == 'N'){
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static String toUpperCase(String st){
        StringBuilder sb =new StringBuilder("");
        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for (int i=1;i<st.length();i++){
            if (st.charAt(i)==' ' && i<st.length()){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }
            else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compretion(String com){
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<com.length();i++){
            Integer count=1;
            while (i<com.length()-1 && com.charAt(i)== com.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(com.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int arr[]={3,1,-6,4,8,0,-12,2};
//        int key=8;
//        search(arr,key);
//        System.out.println("Largest element of this array is : "+largest(arr));
//
//        int num[]={1,2,3,4,5,6,7,8};
//        int point=7;
//        System.out.println("Element found at index : "+binary(num,point));
//
//        reverse(arr);
//        printarray(arr);
//        pairsINarray(arr);
//
//        subarray(arr);

        //maxSubArraySum(arr);
        //MaxsubArraySumByPrefixSum(arr);
        //MaxSubarraySumBYKadanesalgo(arr);


//        int height[]={4,2,0,6,3,2,5};
//        System.out.println(trappingRainWater(height));
//
//        BuySellStocks(height);

//        System.out.println(Secondlargest(height));
//
//        int num[][]={{6,3,4,7,1,0,3},
//                {2,3,8,0,5,6,1}};
//        int key=8;
//        //search(num,key);
//        largestsmallest(num);

//        int matrix[][]={{1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}};
//        //printSpiralMatrix(matrix);
//        System.out.println(DiagonalMatrix(matrix));
//        System.out.println(searchIN2D(matrix));
//
//        String name="racecar";
//        System.out.println(palindrome(name));
//
//        String path="WNEENESENNN";
//        System.out.println(shortestpath(path));
//
//        String st ="hi i am gunjan kumar chouhan";
//        System.out.println(toUpperCase(st));

        String com="aaabbcccdd";
        System.out.println(compretion(com));

    }
}
