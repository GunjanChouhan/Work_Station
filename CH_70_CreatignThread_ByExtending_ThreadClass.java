package Company;
class Mythread extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("My cooking thread is running ");
            System.out.println("I am happy");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class CH_70_CreatignThread_ByExtending_ThreadClass {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
