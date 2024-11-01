package Company;
import java.util.HashMap;
public class DSA_67_Hashmap {
    public static void main(String[] args) {
        //Create
        HashMap <String,Integer> hm= new HashMap<>();

        //Insert
        hm.put("India",150);
        hm.put("China",200);
        hm.put("US",50);
        System.out.println(hm);

        //Get
        int population =hm.get("India");
        System.out.println(population);

        //ContainsKey
        System.out.println(hm.containsKey("India"));

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

        //Clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
