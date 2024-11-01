package Company;

import java.util.HashSet;
import java.util.Set;

public class DSA_70_Union_Intersection {
    public static void Union(int arr1[],int arr2[]){
        int count=0;
        HashSet<Integer> Set=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            Set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            Set.add(arr2[i]);
        }
        System.out.println("Union : "+Set.size());
    }
    public static void Intersection(int arr1[],int arr2[]){
        int count=0;
        HashSet<Integer> Set=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            Set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(Set.contains(arr2[i])) {
                count++;
                Set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection : "+count);
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        Union(arr1,arr2);
        Intersection(arr1,arr2);
    }
}
