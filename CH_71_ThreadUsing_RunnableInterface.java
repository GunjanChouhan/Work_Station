package Company;
class MythreadRunnable implements Runnable{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am a Thread not a threat");
            i++;
        }
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am a Thread 2 not a threat 2");
            i++;
        }
    }
}
public class CH_71_ThreadUsing_RunnableInterface {
    public static void main(String[] args) {
        MythreadRunnable bullet=new MythreadRunnable();
        Thread gun=new Thread(bullet);
        MythreadRunnable2 bullet1=new MythreadRunnable2();
        Thread gun2=new Thread(bullet1);
        gun.start();
        gun2.start();
    }
}
