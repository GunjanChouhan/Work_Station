package Company;

public class DSA_4_BinarySearch {
    public static int BinarySearch(int number[],int key){
         int start=0;
         int end= number.length-1;
         while (start<=end){
              int mid=(start+end)/2;

              //Comparisons
             if(number[mid]==key){
                 return mid;
             }
             if (number[mid]<key){     //Right
                 start=mid+1;
             }else {                   //Left
                 end=mid-1;
             }
         }
         return -1;
    }
    public static void main(String[] args) {
          int number[]={2,4,6,8,10,12,14};
          int key=10;
        System.out.println("Index of Key is : "+BinarySearch(number,key));
    }
}
