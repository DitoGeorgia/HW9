import java.util.Scanner;

public class Main2 {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        while (true) {
            a = inputDouble();
            String simbol = mathSymbol();
            b = inputDouble();

            if (simbol.equals("+")) {
                sum();
            } else if (simbol.equals("-")) {
                diff();
            } else if (simbol.equals("*")) {
                multiply();
            } else if (simbol.equals("/")) {
                divide();
            }
            System.out.println();
        }

        /*sum();      //Метод суммирования чисел
        diff();     //Метод вычитания чисел
        multiply(); //Метод умножения чисел
        divide();   //Метод деления чисел*/
    }

    private static void sum() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    private static void diff() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void multiply() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    private static void divide() {
        System.out.println(a + " / " + b + " = " + (a / b));
    }


    private static double inputDouble() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    private static String mathSymbol() {
        System.out.println("Введите:  +    -    *    /");
        return new Scanner(System.in).nextLine();
    }
}
