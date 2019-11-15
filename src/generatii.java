import java.util.Scanner;

public class generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduceti varsta");
        int age = in.nextInt();
        String generatia;
        if (age <= 0) {
            // generatia = "valoarea incorecta";
            System.out.println("Varsta incorecta");
            return;
        } else if (age < 6) {
            generatia = "alfa";
        } else if (age <= 20) {
            generatia = "Z";
        } else {
            generatia = "Builders";
        }
        System.out.println("generatia este:" + generatia);
    }
}
