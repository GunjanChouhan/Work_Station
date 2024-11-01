package Company;

public class DSA_62_missing_from_String {
    public static int  ascii(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=(int)str.charAt(i);
        }
        return sum;
    }
    public static char ch(String str1,String str2){
        int s=ascii(str1)-ascii(str2);
        char sh=(char)s;
        return sh;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="abcd";
        System.out.println(ch(str1,str2));
    }
}
