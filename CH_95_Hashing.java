package Company;

import java.util.HashSet;

public class CH_95_Hashing {
    public static void main(String[] args) {
        HashSet<Integer> MyHashset =new HashSet<>(6,0.5f);
        MyHashset.add(32);
        MyHashset.add(21);
        MyHashset.add(77);
        MyHashset.add(11);
        MyHashset.add(11);
        System.out.println(MyHashset);
    }
}
