package Company;

public class DSA_15_BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn< arr.length-1;turn++){
            for(int j=0;j< arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void bubblepractice(int practice[]){
        int swap=0;
        for(int i=0;i<practice.length-1;i++){
            for(int j=0;j<practice.length-1-i;j++){
                if (practice[j]>practice[j+1]) {
                    int temp = practice[j + 1];
                    practice[j + 1] = practice[j];
                    practice[j] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }
    public static void printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printarr(arr);


        int practice[]={1,2,3,4,5};
        bubblepractice(practice);
        printarr(practice);
    }
}
