package Company;

public class DSA_31_Strings_Function_Comparision {
    public static void main(String[] args) {
        String s1="Gunjan";
        String s2="Gunjan";
        String s3=new String("Gunjan");

        if (s1==s2){
            System.out.println("The Strings are equal");
        }else {
            System.out.println("The Strings are not equal");
        }

        if (s1==s3){
            System.out.println("The Strings are equal");
        }else {
            System.out.println("The Strings are not equal");
        }

        if (s1.equals(s3)){
            System.out.println("The Strings are equal");
        }else {
            System.out.println("The Strings are not equal");
        }
    }
}
