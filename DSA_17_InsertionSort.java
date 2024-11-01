package Company;

public class DSA_17_InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i=0;i< arr.length;i++){
            int crr=i;
            int pre=i-1;

            //Finding out correct position to insert
            while (pre>=0 && arr[pre] >crr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            //Insertion
            arr[pre+1]=crr;
        }
    }
    public static void printarr(int arr []){
        for (int i=1;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
    }
}
