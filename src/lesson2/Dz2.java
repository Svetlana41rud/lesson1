package lesson2;

public class Dz2 {
    public static void main(String[] args) {
        System.out.println(summ(6, 5));
        PolOrNegativ(-1);
        System.out.println(number(5));
        TextNumber("Привет",10);
    }

    //первое задание
    public static boolean summ(int a, int b) {
        int summ = a + b;
        if (summ > 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }

    }

    // второе задание
    public static void PolOrNegativ(int a) {
        if (a >= 0) {

            System.out.println("Положительное");
        } else {

            System.out.println("Отрицательное");
        }
    }

    //третье здание
    public static boolean number(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //четвертое задание
    public static void TextNumber(String slovo, int number) {
        for (int i = 0; i < 10; i++) {
            System.out.println(slovo  + i);
        }

    }
}

