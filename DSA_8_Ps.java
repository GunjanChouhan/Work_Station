package Company;

public class DSA_8_Ps {
    public static int BinarySearch(int number[],int key){
        int mid;
        int start=0;
        int end= number.length-1;
        while (start<=end){
            mid=(start+end)/2;
            if (number[mid] == key){
                return mid;
            }
            if (number[mid]<key) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int number[]){
        int first=0;
        int last= number.length-1;
        while (first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }
    public static void PairsIN_anArray(int number []){
        int tp=0;
        for (int i=0;i< number.length;i++){
            for (int j=i+1;j< number.length;j++){
                System.out.print("("+number[i] +","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);
    }


    public static void SubArray(int number []){
        int ts=0;
        for (int i=0;i< number.length;i++){
            for (int j=i;j< number.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+ts);
    }


    public static void SumofSubArray(int number[]){
        int sum=0;
        for (int i=0;i< number.length;i++){
            for (int j=i;j< number.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                    sum+=number[k];
                }
                System.out.print("="+sum);
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
           int number[]={2,4,6,8,10,12,14};
//        int key=10;
//        System.out.println("Index for Key is : "+BinarySearch(number,key));


//        reverse(number);
//        for (int i=0;i<number.length;i++){
//            System.out.print(number[i]+" ");
//        }
//        System.out.println();


//        PairsIN_anArray(number);

//        SubArray(number);

        SumofSubArray(number);
    }
}
