package Company;

public class DSA_2_LinearSearch {
    public static int LinearSearch(int numbers[],int key){
        for (int i=0;i< numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static int LinearSearch2(String menu[],String search){
        for (int i=0;i< menu.length;i++){
            if(search==menu[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        String menu[]={"Dhosa","idli","Frid_rice","Samosa","Egg_roll","Veg_roll"};
        String search="Samosa";
        int key=10;

        int index = LinearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        }
        System.out.println("Key is at index : "+index);

        int place=LinearSearch2(menu,search);
        if(place==-1){
            System.out.println("Not Found");
        }
        System.out.println("Search is at placed : " +place);
    }
}
