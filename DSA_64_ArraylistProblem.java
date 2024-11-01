package Company;
import java.util.ArrayList;
public class DSA_64_ArraylistProblem {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        list.add(1,100);
        System.out.println(list);

        list.set(1,10);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(7));
        System.out.println(list);

        boolean ans = list.contains(Integer.valueOf(10));
        System.out.println(ans);

        ArrayList l=new ArrayList();
        l.add("asdf");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}

