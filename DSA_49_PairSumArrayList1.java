package Company;

import java.util.ArrayList;

public class DSA_49_PairSumArrayList1 {
    public static boolean pairsum1(ArrayList<Integer> list,int target){
        for (int i=0; i< list.size(); i++){
            for (int j=i+1;j< list.size();j++){
                if (list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean pairsum1_2Pointer(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp != rp){
            if (list.get(lp)+ list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+ list.get(rp)<target) {
                lp++;
            }else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        //System.out.println(pairsum1(list,target));
        System.out.println(pairsum1_2Pointer(list,target));
    }
}
