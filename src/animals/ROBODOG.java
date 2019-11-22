package animals;

public  class ROBODOG implements Pet, Animal, Robot {
    protected int battery = 50;


    @Override
    public void makeNoise() {
        System.out.println("barkzzz!");

    }

    @Override
    public void play() {
        System.out.println("Jetpack bacflip!");

    }

    @Override
    public void recharge() {
        battery = 100;


















    }
}
