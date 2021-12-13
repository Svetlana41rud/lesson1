package lesson7;

public class Main {
    public static void main(String[] args){
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Tigra", 50), new Cat("Nazar", 50)};

        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
