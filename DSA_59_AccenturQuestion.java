package Company;

public class DSA_59_AccenturQuestion {
    public static String reverse(String str){
        String rev=" ";
        for (int i=0;i<str.length();i++){
            rev=str.charAt(i) + rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        String str="Gupteswar";
        System.out.println(reverse(str));
    }
}
