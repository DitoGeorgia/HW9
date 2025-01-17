import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        diff();     //Метод вычитания чисел
        multiply(); //Метод умножения чисел
        divide();   //Метод деления чисел
    }

    private static void sum() {
        System.out.println("Сумма:      " + a + " + " + b + " = " + (a + b));
    }

    private static void diff() {
        System.out.println("Разность:   " + a + " - " + b + " = " + (a - b));
    }

    private static void multiply() {
        System.out.println("Умножение:  " + a + " * " + b + " = " + (a * b));
    }

    private static void divide() {
        System.out.println("Деление:    " + a + " + " + b + " = " + (a + b));
    }


    private static double inputDouble() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
