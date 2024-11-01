package Company;
class MyThr2 extends Thread{
    public void run(){
        int i = 0;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: 1" + this.getName());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }
}
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: 2" + this.getName());
        }

    }
}
public class CH_75_Threads_Methods {
    public static void main(String[] args) {
        MyNewThr1 mt=new MyNewThr1();
        MyNewThr1 mt1=new MyNewThr1();
        mt.start();
//        try{
//            mt.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        mt1.start();
    }
}
