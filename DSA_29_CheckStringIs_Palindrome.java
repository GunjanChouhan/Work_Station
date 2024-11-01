package Company;

public class DSA_29_CheckStringIs_Palindrome {
    public static boolean CheckPalindrome(String name){
        for (int i=0;i<name.length()/2;i++){
            //Not a palindrome
            if (name.charAt(i)!=name.charAt(name.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="racecar";
        System.out.println(CheckPalindrome(name));
    }
}
