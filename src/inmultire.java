import java.util.Scanner;

public class inmultire {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;

       /* while (i <= 9) {
            System.out.println(i + "X" + n + "=" + i*n);
            i++;
        }*/
        for (i = 1; i <=9; i++) {
            System.out.println(i + "X" + n + "=" + i*n);
        }
    }
}

