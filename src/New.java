
import java.util.Arrays;

public class New {

    public static void main(String[] args) {

        int[] myList = new int[10];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = 100 + (int) (Math.random() * ((110 - 10) + 1));

        }
        Arrays.sort(myList);
        System.out.println(Arrays.toString(myList));
        doubleArray(myList);
        System.out.println(Arrays.toString(myList));
        notByReference(myList);
        System.out.println(Arrays.toString(myList));

    }

    public static void doubleArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
    }

    public static int[] notByReference(int[] arr){
        arr = new int[2];
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}