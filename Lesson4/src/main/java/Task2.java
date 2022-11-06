import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)  {
        int a = new Scanner(System.in).nextInt();
        System.out.print(a % 2 == 0 ? "Число является четным": "Число является не четным");
        if (a % 1 != 0) {
            System.out.println("error");
        }
    }
}

//2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.