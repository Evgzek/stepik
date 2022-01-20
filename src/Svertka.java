import java.util.Arrays;
import java.util.Scanner;

public class Svertka {
    public static void Udalenie_Elementa(int[] a,int [] b, int n ){
        for (int i = 0, j =0; i < a.length; i++) {
            if(i != n ){
                b[j++] = a[i];
            }
        }

    }
    public static void Udalenie_Elementa2(int[] a, int n ){
        int [] b = new int[a.length-n];
        for (int i = 0, j =0; i < b.length; i++) {
                b[j++] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Vvedite razmer ");
       // int  k = in.nextInt();
        int k;
        int [] array = new int[]{3,2,3,3,3,1,3,1,1,3};
        k = array.length;
        int[] b = new int[array.length-1];
        int e = 0;
        //for (int i = 0; i < k; i++) {
          //  array[i] = in.nextInt();
        //}
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < k; i++) {
            System.out.println(i + " hh");
            if (i == k-1){
                break;
            }else if (array[i] == array[i+1]){
                array[i] = array[i] + 1;
                Udalenie_Elementa(array, b, i+1);
                array = b;
                System.out.println(Arrays.toString(array));
                System.out.println(Arrays.toString(b));
                i = i - 1;
                k = k - 1;
                e +=1;
            }else if( i == 0){
                continue;
            }else if (array[i] == array[i-1]){
                array[i] = array[i]+1;
                Udalenie_Elementa(array,b,i-1);
                i = i -1;
                k = k -1;
                e+=1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(e + " kk");
        if (e>1)
        {Udalenie_Elementa2(array, e-1);}
    }
}
