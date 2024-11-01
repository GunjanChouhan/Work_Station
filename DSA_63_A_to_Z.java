package Company;

public class DSA_63_A_to_Z {
    public static void main(String[] args) {
        int diff=32;
        for(int i=65;i<=90;i++){
            if(i%2!=0){
                System.out.print((char)i+" ");
            } else {
                int ch=i+diff;
                System.out.print((char)ch+" ");
            }
        }
    }
}
