package Company;

public class DSA_6_Pairs_IN_Array {
    public static void PairsPrint(int numbers[]){
        int tp=0;
        for(int i=0;i< numbers.length;i++){
            int crr=numbers[i];
            for (int j=i+1;j< numbers.length;j++){
                System.out.print("("+crr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+ tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        PairsPrint(numbers);
    }
}
