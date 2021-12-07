package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", 0, 5);
        Dog dog = new Dog("Borbos", 500, 10);


        cat.run();
        dog.run();

        cat.sail();
        dog.sail();

        Cat.getY();
        Dog.getX();
        Animal.getQuantity();

        System.out.println("Количество кошек: " + Cat.getY() + "\n" + "Количество собак: " + Dog.getX() + "\n" + "Всего животных: " + Animal.getQuantity());

    }
}
