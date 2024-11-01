package Company;

public class DSA_20_SecondLargestElement {

    public static int gun(int arr []) {
        int Second_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest) {
                Second_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] > Second_largest && arr[i] != largest) {
                Second_largest = arr[i];
            }
        }
        return Second_largest;


    }
    public static void main(String[] args) {
        int arr[]={11,17,29,18,20,10};
        System.out.println(gun(arr));
        
    }
}
