package lesson6;

public class Animal {  String name;
    int run;
    int sail;
    static int quantity = 0;

    public Animal(String name, int run, int sail) {
        this.name = name;
        this.run = run;
        this.sail = sail;
        quantity++;
    }
    public void run(){
        System.out.println(name + " пробежал(а) " + run + " m");
    }

    public void sail(){
        System.out.println(name + " проплыл(а) " + sail + " m");
    }

    public static int getQuantity() {
        return quantity;
    }
}
