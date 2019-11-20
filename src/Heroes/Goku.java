package Heroes;

public class Goku extends Hero{

    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        fireSecondary();
        mana -= 5;
    }

    @Override
    public void fireSecondary() {
        mana -= 40;

    }

    @Override
    public void reciveHit() {
        hp -= 1;
        mana += 3;

    }
}
