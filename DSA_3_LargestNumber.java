package Company;

public class DSA_3_LargestNumber {
    public static int get_Largest(int number[],int largest,int minimum){
        for (int i=0;i< number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
            if(minimum>number[i]){
                minimum=number[i];
            }
        }
        System.out.println("Minimum value in this Array is : "+ minimum);
        return largest;
    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5};
        int largest=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        System.out.println("Largest element in this Array is : "+get_Largest(number,largest,minimum));
    }
}
