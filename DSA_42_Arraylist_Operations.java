package Company;

import java.util.ArrayList;

public class DSA_42_Arraylist_Operations {
    public static void main(String[] args) {
        //Add Element
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);

        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Remove Operation
        list.remove(2);
        System.out.println(list);

        //Set element at index
        list.set(2,10);
        System.out.println(list);

        //Contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Size of ArrayList
        System.out.println(list.size());

        //print the ArrayList
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
