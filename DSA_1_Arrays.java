package Company;

public class DSA_1_Arrays {
    public static void update(int marks[], int nonchangable){
        nonchangable=99;
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){
        int marks[]={87,69,93};
        int nonchangable=5;
        update(marks,nonchangable);
        for (int i=0;i< marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println( " ");
        System.out.println("NONCHAGABLE : "+nonchangable);
    }
}
