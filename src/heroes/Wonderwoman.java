package heroes;

public class Wonderwoman extends Hero {
    public Wonderwoman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 10;
        hp++;
    }

    @Override
    public void fireSecondary() {
        mana -=30;
        hp += 3;

    }

    @Override
    public void reciveHit() {
        hp--;

    }
}
