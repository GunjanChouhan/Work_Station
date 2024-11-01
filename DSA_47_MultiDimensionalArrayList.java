package Company;
import java.util.*;
public class DSA_47_MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<Integer> List2=new ArrayList<>();
        ArrayList<Integer> List3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }
        mainlist.add(List1);
        mainlist.add(List2);
        mainlist.add(List3);

        System.out.println(mainlist);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> crrList=mainlist.get(i);
            for (int j=0;j<crrList.size();j++){
                System.out.print(crrList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
