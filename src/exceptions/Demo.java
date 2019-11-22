package exceptions;

public class Demo {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Impartirea nu are sens");
        }
    }
}
