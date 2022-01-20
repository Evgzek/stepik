import java.lang.Math;
import java.util.Scanner;

public class Stepen {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println(b);
        int i = 1;
        while (i < b){
            i = i*2;
        }
        if (i == b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
