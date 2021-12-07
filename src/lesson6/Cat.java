package lesson6;

public class Cat extends Animal {
    public Cat(String name, int run, int sail) {
        super(name, run, sail);
        y++;
    }
    public static int y = 0;
    public void run() {
        if (run > 0 && run <= 200)
            System.out.println(name + " пробежала " + run + " m");
        else {
            System.out.println(name + " не бегала");

        }
    }
    public void sail() {
        if (sail >=0)
            System.out.println(name + " не умеет плавать");

    }

    public static int getY() {
        return y;
    }


}
