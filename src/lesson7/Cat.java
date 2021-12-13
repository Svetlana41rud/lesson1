package lesson7;

public class Cat {
    private String name;
    private int toeat;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.toeat = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(toeat))
            hungry = false;
    }
}