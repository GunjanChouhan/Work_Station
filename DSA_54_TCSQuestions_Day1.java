package Company;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_54_TCSQuestions_Day1 {
    public static int SubarrayWITHsum(int [] arr,int sum){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int subsum=0;
                for (int k=i;k<=j;k++){
                    subsum += arr[k];
                }
                if (sum==subsum){
                    count++;
                }
            }
        }
        return count;
    }
    public static int maxSUMSubArray(int arr []){
        int Maxsum=Integer.MIN_VALUE;
        int Crrsum=0;
        for (int i=0;i< arr.length;i++){
            Crrsum+=arr[i];
            if (Crrsum < 0){
                Crrsum=0;
            }
            if (Crrsum>Maxsum){
                Maxsum=Crrsum;
            }
        }
        return Maxsum;
    }
    public static String[] RemoveDublicate(String [] arr){
        String [] Updated=new String[arr.length];
        int index=0;
        for (int i=0;i<arr.length;i++){
            boolean isDublicate=false;
            for (int j=0;j<Updated.length;j++){
                if (arr[i].equals(Updated[j])){
                    isDublicate=true;
                    break;
                }
                if (!isDublicate){
                    Updated[index]=arr[i];
                    index++;
                }
            }
        }
        String [] result = new  String[index];
        for (int i=0;i<index;i++){
            result[i]=Updated[i];
        }
        return result;
    }

    public static int latest(String [] file){
        int filenumber=0;
        int latestnumber=Integer.MIN_VALUE;
        for (int i=0;i<file.length;i++){
            String [] split=file[i].split("_");
            filenumber=Integer.parseInt(split[1]);
            if (filenumber>latestnumber){
                latestnumber=filenumber;
            }
        }
        return latestnumber;
    }
    public static String incode(String sc){
        StringBuilder ns=new StringBuilder(" ");
        for (int i=0;i<sc.length();i++){
            int count=0;
            if(sc.charAt(i)=='1'){
                while (sc.charAt(i)=='1'){
                    count++;
                    i++;
                }
            }
            char ch= (char)('A'+count-1);
            ns.append(ch);
        }
        return ns.toString();
    }
    public static int priorelement(int [] arr){
        int count=0;
        int greaterpriorelement=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>greaterpriorelement){
                greaterpriorelement=arr[i];
                count++;
            }
        }
        return count;
    }

    public static int sort(int [] arr){
        int [] sot=new int[arr.length];
        int check=0;
        sot[0]=arr[0];
        for (int i=1; i<arr.length;i++){
            if (arr[i]>=arr[i-1]){
                sot[i]=arr[i];
            }else {
                check=sot[i-1];
                sot[i-1]=arr[i];
                sot[i]=check;
            }
        }
        return sot[sot.length];
    }
    public static void main(String[] args) {
        //Question 1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array : ");
//        int n= sc.nextInt();
//        int arr [] = new int[n];
//        System.out.print("Enter element of array : ");
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.print("Enter your sum : ");
//        int sum= sc.nextInt();
//        System.out.println(SubarrayWITHsum(arr,sum));




        //Question 3
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter size of Array : ");
//        int n= sc.nextInt();
//        int [] arr =new int[n];
//        System.out.println("Enter Element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(maxSUMSubArray(arr));
//



        //Question 4
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter size of Array : ");
//        int n= sc.nextInt();
//        String [] arr =new String[n];
//        System.out.println("Enter Element of Array : ");
//        for (int i=0;i<n;i++){
//            arr[i]=sc.next();
//        }
//        System.out.println(Arrays.toString(RemoveDublicate(arr)));







//        String file[]={"file_1","file_2","file_3","file_4"};
//        System.out.println(latest(file));




//        String sc="101101110";
//        System.out.println(incode(sc));


//        int arr[]={7,4,8,2,9};
//        System.out.println(priorelement(arr));


        int [] arr={2,0,1,2,1,0};
        System.out.println(sort(arr));

    }
}
