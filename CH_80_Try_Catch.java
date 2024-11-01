package Company;

public class CH_80_Try_Catch {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        //Without try
//        int c = a / b;
//        System.out.println("The result is : "+ c);
        //With try
        try {
            int c = a / b;
            System.out.println("The result is : "+ c);
        }
        catch (Exception e){
            System.out.println("we faild to divide Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the Program");
    }
}
