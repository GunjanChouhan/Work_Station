package Company;
class Mythr extends Thread{
    public Mythr(String NAME){
        super(NAME);
    }
    public void run(){
        int i=0;
        while (i<90){
            System.out.println("I am a Thread");
            i++;
        }
    }
}
class Bhai implements Runnable{
    public Bhai(String name){
        super();
    }
    public void run(){
        int i=0;
        while (i<89){
            System.out.println("You are Super person");
            i++;
        }
    }
}
public class CH_73_Thread_Constructor {
    public static void main(String[] args) {
        Mythr th=new Mythr("Gunjan");
        Mythr th2=new Mythr("Chouhan");

        th.start();
        th2.start();
        System.out.println("The id of this thread is:"+th.getId());
        System.out.println("The nameof this Thread is"+th.getName());
        System.out.println("The id of this thread is:"+th2.getId());
        System.out.println("The nameof this Thread is"+th2.getName());
        Bhai b=new Bhai("Surya");
        Thread b1=new Thread(b);
        b1.start();
        System.out.println("ID"+b1.getId());
        System.out.println("NAME"+b1.getName());

    }
}
