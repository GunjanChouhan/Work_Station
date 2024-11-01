package Company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CH_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();
        l2.add(12);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        l1.add(7);
        l2.add(0,19);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(80);
        l1.addFirst(12);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));

        //l1.clear();
        l1.set(1,566);
        for (int i =0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");

        }
    }

}
