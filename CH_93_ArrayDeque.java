package Company;

import java.util.ArrayDeque;

public class CH_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(9);
        ad1.add(2);
        ad1.add(45);
        ad1.addFirst(32);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
