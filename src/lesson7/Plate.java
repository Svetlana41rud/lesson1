package lesson7;

public class Plate {

    public int food;
    public Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int toeat) {
        int diff = food - toeat;
        if (diff < 0) return false;

        food -= toeat;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}

