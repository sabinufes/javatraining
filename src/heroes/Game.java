package heroes;

public class Game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new Mage("Jaina", 200, 400);
        Wonderwoman hero3 = new Wonderwoman("Diana", 500, 100);

        hero1.firePrimary();

        hero2.reciveHit();
        hero3.reciveHit();

        hero2.fireSecondary();
        hero1.reciveHit();
        hero1.reciveHit();
        hero3.reciveHit();
        hero3.reciveHit();

        System.out.println(hero1.toString());
        System.out.println(hero1.toString());
        System.out.println(hero3.toString());

    }
}
