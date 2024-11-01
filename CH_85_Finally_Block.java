package Company;

public class CH_85_Finally_Block {
    public static int greet(){
        try{
            int a=5;
            int b=2;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the function");
        }
        return 0;
    }
    public static void main(String[] args) {
        int l =greet();
        System.out.println(l);
        int a=6;
        int b=9;
        while (true) {
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally for value of b = " +b);
            }
            b--;
        }
        try {
            System.out.println(50/5);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
