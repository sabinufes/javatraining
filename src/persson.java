public class persson {
    private  String name;
    private int age;
    private int height;
    private int stamina;

    public void run() { stamina--; }

    public void sleep() { stamina += 12; }

    public boolean isMajor() {return age >= 18; }
    public int getAge() {
        return age;
    }

}
