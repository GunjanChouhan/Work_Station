package Company;

import java.util.ArrayList;

public class DSA_48_ContainerWithMostWater {
    public static int ContainerWithMostWater(ArrayList<Integer> height){

        int maxwater=Integer.MIN_VALUE;
        for (int i=0;i< height.size();i++){
            for (int j=i+1;j< height.size();j++){
                int ht=Math.min(height.get(i), height.get(j) );
                int width=j-i;
                int crrWater=ht * width;
                if (maxwater<crrWater){
                    maxwater=crrWater;
                }
            }
        }
        return maxwater;
    }
    public static int ContainerWithMostWaterBetterTC(ArrayList<Integer>height){
        // 2 pointer approach
        int lp=0;
        int rp= height.size()-1;
        int maxwater=Integer.MIN_VALUE;
        while (lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int crrwater=ht*width;
            if (maxwater<crrwater){
                maxwater=crrwater;
            }
            if (height.get(lp)<height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum water  contain : "+ContainerWithMostWater(height));
        System.out.println("Maximum water  contain : "+ContainerWithMostWaterBetterTC(height));


    }
}
