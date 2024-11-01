package Company;

public class DSA_40_ps {
    public static float ShortestDIstance(String dir){
        int x=0;
        int y=0;
        for (int i=0;i<dir.length();i++){
            if (dir.charAt(i)=='E'){
                x++;
            }
            else if (dir.charAt(i)=='W') {
                x--;
            }
            else if (dir.charAt(i)=='N') {
                y++;
            }
            else {
                y--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void builder(){
        StringBuilder sb=new StringBuilder("");
        for (char i='A';i<='Z';i++){
            sb.append(i);
        }
        System.out.println("StringBuilder : "+sb);
    }
    public static String firstletteruppercase(String st){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for (int i=1;i<st.length();i++){
            if (st.charAt(i)==' ' && i<st.length()-1){
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            }else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();


    }
    public static String compression(String com){
        StringBuilder sb = new StringBuilder("");
        for (int i=0;i<com.length();i++){
            Integer count=1;
            while (i<com.length()-1 && com.charAt(i)== com.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(com.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        String dir="WNEENESENNN";
//        System.out.println(ShortestDIstance(dir));
//
//        /////////////////////////////////////////////////
//        System.out.println(dir.substring(0,5));
//
//        ////////////////////////////////////////////////
//        String fruits []={"apple","mango","banana"};
//        String largest=fruits[0];
//        for (int i=0;i<fruits.length;i++){
//            if (largest.compareTo(fruits[i])<0){
//                largest=fruits[i];
//            }
//        }
//        System.out.println(largest);
        //builder();

        //String st="hi i am gunjan";
        //System.out.println("Change first letter in upper case : "+firstletteruppercase(st));
        String com="aaabbcccdd";
        System.out.println("Compression : "+compression(com));
    }
}
