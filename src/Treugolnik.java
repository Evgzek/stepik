import java.util.Scanner;
public class Treugolnik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if((a + b) > c ){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
