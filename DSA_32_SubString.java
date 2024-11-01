package Company;

public class DSA_32_SubString {
    public static String substring(String str,int si,int ei){
        String substring="";
        for (int i =si;i<ei;i++){
            substring += str.charAt(i);
        }
        return  substring;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str,0,5));
    }
}
