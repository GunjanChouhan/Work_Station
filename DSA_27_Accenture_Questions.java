package Company;

public class DSA_27_Accenture_Questions {
    public static void nextGreatestElement(int[] arr) {
        // Traverse the array from the start to the second last element
        for (int i = 0; i < arr.length - 1; i++) {
            boolean found = false;
            // Find the next greater element for arr[i]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    found = true;
                    break;
                }
            }
            // If no greater element was found, set arr[i] to -1
            if (found==false) {
                arr[i] = -1;
            }
        }
        // The last element always gets -1 as there is no element to its right
        arr[arr.length - 1] = -1;
    }

    public static void print(int[] grr) {
        for (int i = 0; i < grr.length; i++) {
            System.out.print(grr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        nextGreatestElement(arr);
        print(arr);
    }
}
