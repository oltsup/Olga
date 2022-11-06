import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        float tmp = Math.min(a,b);
        float min = Math.min(tmp, c);
        System.out.println("Наименьшее вещественное число по модулю: " + min);
    }
}

//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.