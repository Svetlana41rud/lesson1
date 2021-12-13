package lesson6;

public class Dog extends  Animal {

    public Dog(String name, int run, int sail) {
        super(name, run, sail);
        x++;
    }
    public  static int x = 0;

    public void run() {
        if (run > 0 && run <= 500)
            System.out.println(name + " пробежал " + run + " m");
        else {
            System.out.println(name + " не бегал ");

        }
    }
    public void sail() {
        if (sail > 0 && sail <= 10)
            System.out.println(name + " проплыл " + sail + " m");
        else {
            System.out.println(name + " не стал плыть");
        }
    }

    public static int getX() {
        return x;

    }


}

