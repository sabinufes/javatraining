import java.util.Scanner;

    public class picture2 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Linii: ");
            int h = reader.nextInt();
            System.out.println("Coloane: ");
            int w = reader.nextInt();



            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();


            }
        }

    }



