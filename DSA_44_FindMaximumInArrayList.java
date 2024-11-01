package Company;

import java.util.ArrayList;

public class DSA_44_FindMaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int Max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            if (list.get(i)>Max){
                Max=list.get(i);
            }
        }
        System.out.println("Max : "+Max);
    }
}
