public class student extends persson {
    private String classGroup;

    public student(String name, int age, int height, int stamina, String classGroup) {
        super(name, age, height, stamina);
        this.classGroup = classGroup;
    }
    public void grow(int size)
    {
        height += size;
    }
        }

