import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        int length = String.valueOf(x).length();
        if (x > 0) {
            System.out.printf ("%d - это положительное число, количество цифр = " + length, x);
        }
        else {
            System.out.println(x + " - это отрицательное число, количество цифр = " + length);
        }
    }
}
//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"


