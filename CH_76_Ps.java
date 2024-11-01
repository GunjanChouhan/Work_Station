package Company;
class  Practice13 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class CH_76_Ps {
    public static void main(String[] args) {
        Practice13 p=new Practice13();
//        p.setPriority(6);
        System.out.println(p.getPriority());
        Practice13b p1=new Practice13b();
//        p1.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p1.getState());


//          p.start();
//          p1.start();
          System.out.println(p1.getState());
          System.out.println(Thread.currentThread().getState());


    }
}
