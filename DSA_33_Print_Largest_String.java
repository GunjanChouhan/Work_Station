package Company;

public class DSA_33_Print_Largest_String {
    public static void printlargestString(String fruits [],String largest){
        for (int i=0;i< fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};

        String largest = fruits[0];
        printlargestString(fruits,largest);
    }
}
